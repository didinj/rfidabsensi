/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi;

import absensi.entity.AbsensiLog;
import absensi.entity.Employee;
import absensi.entity.Importlog;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DIDIN
 */
public class Sdutils {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AbsensiPU");

    public void putdatatosd(String driveletter) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Employee e");
        List<Employee> emplist = query.getResultList();
        File oldfile = new File(driveletter, "empfile.txt");
        if (oldfile.exists()) {
            oldfile.delete();
            File newfile = new File(driveletter, "empfile.txt");
            try {
                Writer writer = new BufferedWriter(new FileWriter(newfile));
                Iterator it = emplist.iterator();
                while (it.hasNext()) {
                    Employee emp = (Employee) it.next();
                    writer.append("" + emp.getRfid() + "" + emp.getNik() + "");
                    if (it.hasNext()) {
                        writer.append(",");
                    }
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                oldfile.createNewFile();
                Writer writer = new BufferedWriter(new FileWriter(oldfile));
                Iterator it = emplist.iterator();
                while (it.hasNext()) {
                    Employee emp = (Employee) it.next();
                    writer.append("" + emp.getRfid() + "" + emp.getNik() + "");
                    if (it.hasNext()) {
                        writer.append(",");
                    }
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void importdata(String driveletter) {
        String D, M, Y, h, m, s, cols;
        String line, text, waktu, NIK, tanggal, jam;
        DateFormat timeFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat jamFormat = new SimpleDateFormat("hh:mm");
        File dir = new File(driveletter);
        try {
            File files[] = dir.listFiles();
            for (File f : files) {
                if (f.getName().endsWith(".txt")) {
                    if (f.getName().length() == 10) {
                        EntityManager logem = emf.createEntityManager();
                        Query logquery = logem.createQuery("SELECT i FROM Importlog i WHERE i.filename=:filename");
                        logquery.setParameter("filename", f.getName().toString().trim());
                        List logresult = logquery.getResultList();
                        if (logresult.isEmpty()) {
                            FileInputStream fis = new FileInputStream(f);
                            BufferedInputStream bis = new BufferedInputStream(fis);
                            DataInputStream dis = new DataInputStream(bis);
                            while ((line = dis.readLine()) != null) {
                                StringTokenizer stk = new StringTokenizer(line, ";");
                                while (stk.hasMoreTokens()) {
                                    cols = stk.nextToken();
                                    text = cols.replaceAll(" ", "").trim();
                                    if (text.length() == 20 && !text.isEmpty()) {
                                        NIK = text.substring(0, 8);
                                        D = text.substring(8, 10);
                                        M = text.substring(10, 12);
                                        Y = text.substring(12, 14);
                                        h = text.substring(14, 16);
                                        m = text.substring(16, 18);
                                        s = text.substring(18, 20);
                                        waktu = "20" + Y + "/" + M + "/" + D + " " + h + ":" + m + ":" + s;
                                        jam = h + ":" + m;
                                        tanggal = M + "/" + D + "/20" + Y;
                                        Date udate = dateFormat.parse(tanggal);
                                        EntityManager em = emf.createEntityManager();
                                        if (Integer.parseInt(h) >= 6 && Integer.parseInt(h) <= 10) {
                                            EntityManager lastem = emf.createEntityManager();
                                            Query lastquery = lastem.createQuery("SELECT al FROM AbsensiLog al WHERE al.nik=:nik AND al.tanggal=:tgl AND al.jammasuk IS NOT NULL");
                                            lastquery.setParameter("nik", NIK);
                                            lastquery.setParameter("tgl", udate);
                                            List lastresult = lastquery.getResultList();
                                            if (lastresult.isEmpty()) {
                                                AbsensiLog abs = new AbsensiLog();
                                                try {
                                                    em.getTransaction().begin();
                                                    abs.setNik(NIK);
                                                    abs.setTanggal(udate);
                                                    abs.setJammasuk(jam);
                                                    abs.setKeterangan("Office,Absensi");
                                                    em.persist(abs);
                                                    em.getTransaction().commit();
                                                } catch (Exception e) {
                                                    em.getTransaction().rollback();
                                                } finally {
                                                    if (em.getTransaction().isActive()) {
                                                        em.close();
                                                    }
                                                }
                                            }
                                        } else if (Integer.parseInt(h) >= 15 && Integer.parseInt(h) <= 23) {
                                            EntityManager lastem = emf.createEntityManager();
                                            Query lastquery = lastem.createQuery("SELECT al FROM AbsensiLog al WHERE al.nik=:nik AND al.tanggal=:tgl AND al.jamkeluar IS NULL");
                                            lastquery.setParameter("nik", NIK);
                                            lastquery.setParameter("tgl", udate);
                                            List lastresult = lastquery.getResultList();
                                            if (!lastresult.isEmpty()) {
                                                AbsensiLog abs = (AbsensiLog) lastresult.get(0);
                                                try {
                                                    em.getTransaction().begin();
                                                    abs.setJamkeluar(jam);
                                                    em.merge(abs);
                                                    em.getTransaction().commit();
                                                } catch (Exception e) {
                                                    em.getTransaction().rollback();
                                                } finally {
                                                    if (em.getTransaction().isActive()) {
                                                        em.close();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            Importlog il = new Importlog();
                            try {
                                il.setFilename(f.getName().toString().trim());
                                logem.getTransaction().begin();
                                logem.persist(il);
                                logem.flush();
                                logem.getTransaction().commit();
                            } catch (Exception e) {
                                logem.getTransaction().rollback();
                            } finally {
                                if (logem.getTransaction().isActive()) {
                                    logem.close();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
