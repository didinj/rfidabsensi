/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi;

import absensi.entity.AbsensiLog;
import absensi.entity.AbsensiReport;
import absensi.entity.Employee;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author DIDIN
 */
public class ProcessReport {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AbsensiPU");

    public void process(Integer bulan, Integer tahun) {
        EntityManager em = emf.createEntityManager();
        EntityManager empEM = emf.createEntityManager();
        EntityManager rptEM = emf.createEntityManager();
        EntityManager inEM = emf.createEntityManager();
        List<AbsensiLog> abslist = (List<AbsensiLog>) em.createNativeQuery("SELECT * FROM absensilog WHERE MONTH(tanggal)=" + (bulan + 1) + " AND YEAR(tanggal)=" + tahun, absensi.entity.AbsensiLog.class).getResultList();
        Iterator i = abslist.iterator();
        AbsensiLog abs;
        while (i.hasNext()) {
            abs = (AbsensiLog) i.next();
            Calendar cal = Calendar.getInstance();
            cal.setTime(abs.getTanggal());
            int hari = cal.get(Calendar.DAY_OF_MONTH);
            String monthname = new DateFormatSymbols().getMonths()[bulan];
            Query empQuery = empEM.createQuery("SELECT e FROM Employee e WHERE e.nik=:nik");
            empQuery.setParameter("nik", abs.getNik());
            List emp = empQuery.getResultList();
            Employee e = (Employee) emp.get(0);
            Query rptQuery = rptEM.createQuery("SELECT r FROM AbsensiReport r WHERE r.nik=:nik AND r.bulan=:bulan AND r.tahun=:tahun");
            rptQuery.setParameter("nik", abs.getNik());
            rptQuery.setParameter("bulan", monthname);
            rptQuery.setParameter("tahun", tahun.toString());
            List rptlist = rptQuery.getResultList();
            if (rptlist.isEmpty()) {
                try {
                    inEM.getTransaction().begin();
                    AbsensiReport ar = new AbsensiReport();
                    ar.setNik(abs.getNik());
                    ar.setNama(e.getNama());
                    ar.setBulan(monthname);
                    ar.setTahun(tahun.toString());
                    if(hari==1) {
                        ar.setMasuk1(abs.getJammasuk());
                        ar.setKeluar1(abs.getJamkeluar());
                        ar.setKet1(abs.getKeterangan());
                    }
                    if(hari==2) {
                        ar.setMasuk2(abs.getJammasuk());
                        ar.setKeluar2(abs.getJamkeluar());
                        ar.setKet2(abs.getKeterangan());
                    }
                    if(hari==3) {
                        ar.setMasuk3(abs.getJammasuk());
                        ar.setKeluar3(abs.getJamkeluar());
                        ar.setKet3(abs.getKeterangan());
                    }
                    if(hari==4) {
                        ar.setMasuk4(abs.getJammasuk());
                        ar.setKeluar4(abs.getJamkeluar());
                        ar.setKet4(abs.getKeterangan());
                    }
                    if(hari==5) {
                        ar.setMasuk5(abs.getJammasuk());
                        ar.setKeluar5(abs.getJamkeluar());
                        ar.setKet5(abs.getKeterangan());
                    }
                    if(hari==6) {
                        ar.setMasuk6(abs.getJammasuk());
                        ar.setKeluar6(abs.getJamkeluar());
                        ar.setKet6(abs.getKeterangan());
                    }
                    if(hari==7) {
                        ar.setMasuk7(abs.getJammasuk());
                        ar.setKeluar7(abs.getJamkeluar());
                        ar.setKet7(abs.getKeterangan());
                    }
                    if(hari==8) {
                        ar.setMasuk8(abs.getJammasuk());
                        ar.setKeluar8(abs.getJamkeluar());
                        ar.setKet8(abs.getKeterangan());
                    }
                    if(hari==9) {
                        ar.setMasuk9(abs.getJammasuk());
                        ar.setKeluar9(abs.getJamkeluar());
                        ar.setKet9(abs.getKeterangan());
                    }
                    if(hari==10) {
                        ar.setMasuk10(abs.getJammasuk());
                        ar.setKeluar10(abs.getJamkeluar());
                        ar.setKet10(abs.getKeterangan());
                    }
                    if(hari==11) {
                        ar.setMasuk11(abs.getJammasuk());
                        ar.setKeluar11(abs.getJamkeluar());
                        ar.setKet11(abs.getKeterangan());
                    }
                    if(hari==12) {
                        ar.setMasuk12(abs.getJammasuk());
                        ar.setKeluar12(abs.getJamkeluar());
                        ar.setKet12(abs.getKeterangan());
                    }
                    if(hari==13) {
                        ar.setMasuk13(abs.getJammasuk());
                        ar.setKeluar13(abs.getJamkeluar());
                        ar.setKet13(abs.getKeterangan());
                    }
                    if(hari==14) {
                        ar.setMasuk14(abs.getJammasuk());
                        ar.setKeluar14(abs.getJamkeluar());
                        ar.setKet14(abs.getKeterangan());
                    }
                    if(hari==15) {
                        ar.setMasuk15(abs.getJammasuk());
                        ar.setKeluar15(abs.getJamkeluar());
                        ar.setKet15(abs.getKeterangan());
                    }
                    if(hari==16) {
                        ar.setMasuk16(abs.getJammasuk());
                        ar.setKeluar16(abs.getJamkeluar());
                        ar.setKet16(abs.getKeterangan());
                    }
                    if(hari==17) {
                        ar.setMasuk17(abs.getJammasuk());
                        ar.setKeluar17(abs.getJamkeluar());
                        ar.setKet17(abs.getKeterangan());
                    }
                    if(hari==18) {
                        ar.setMasuk18(abs.getJammasuk());
                        ar.setKeluar18(abs.getJamkeluar());
                        ar.setKet18(abs.getKeterangan());
                    }
                    if(hari==19) {
                        ar.setMasuk19(abs.getJammasuk());
                        ar.setKeluar19(abs.getJamkeluar());
                        ar.setKet19(abs.getKeterangan());
                    }
                    if(hari==20) {
                        ar.setMasuk20(abs.getJammasuk());
                        ar.setKeluar20(abs.getJamkeluar());
                        ar.setKet20(abs.getKeterangan());
                    }
                    if(hari==21) {
                        ar.setMasuk21(abs.getJammasuk());
                        ar.setKeluar21(abs.getJamkeluar());
                        ar.setKet21(abs.getKeterangan());
                    }
                    if(hari==22) {
                        ar.setMasuk22(abs.getJammasuk());
                        ar.setKeluar22(abs.getJamkeluar());
                        ar.setKet22(abs.getKeterangan());
                    }
                    if(hari==23) {
                        ar.setMasuk23(abs.getJammasuk());
                        ar.setKeluar23(abs.getJamkeluar());
                        ar.setKet23(abs.getKeterangan());
                    }
                    if(hari==24) {
                        ar.setMasuk24(abs.getJammasuk());
                        ar.setKeluar24(abs.getJamkeluar());
                        ar.setKet24(abs.getKeterangan());
                    }
                    if(hari==25) {
                        ar.setMasuk25(abs.getJammasuk());
                        ar.setKeluar25(abs.getJamkeluar());
                        ar.setKet25(abs.getKeterangan());
                    }
                    if(hari==26) {
                        ar.setMasuk26(abs.getJammasuk());
                        ar.setKeluar26(abs.getJamkeluar());
                        ar.setKet26(abs.getKeterangan());
                    }
                    if(hari==27) {
                        ar.setMasuk27(abs.getJammasuk());
                        ar.setKeluar27(abs.getJamkeluar());
                        ar.setKet27(abs.getKeterangan());
                    }
                    if(hari==28) {
                        ar.setMasuk28(abs.getJammasuk());
                        ar.setKeluar28(abs.getJamkeluar());
                        ar.setKet28(abs.getKeterangan());
                    }
                    if(hari==29) {
                        ar.setMasuk29(abs.getJammasuk());
                        ar.setKeluar29(abs.getJamkeluar());
                        ar.setKet29(abs.getKeterangan());
                    }
                    if(hari==30) {
                        ar.setMasuk30(abs.getJammasuk());
                        ar.setKeluar30(abs.getJamkeluar());
                        ar.setKet30(abs.getKeterangan());
                    }
                    if(hari==31) {
                        ar.setMasuk31(abs.getJammasuk());
                        ar.setKeluar31(abs.getJamkeluar());
                        ar.setKet31(abs.getKeterangan());
                    }
                    inEM.persist(ar);
                    inEM.getTransaction().commit();
                } catch (Exception ex) {
                    inEM.getTransaction().rollback();
                } finally {
                    if (inEM.getTransaction().isActive()) {
                        inEM.close();
                    }
                }
            } else {
                try {
                    inEM.getTransaction().begin();
                    Query query = inEM.createNativeQuery("UPDATE absensireport SET masuk" + hari + "=?,keluar" + hari + "=?,ket" + hari + "=?");
                    query.setParameter(1, abs.getJammasuk());
                    query.setParameter(2, abs.getJamkeluar());
                    query.setParameter(3, abs.getKeterangan());
                    query.executeUpdate();
                    inEM.getTransaction().commit();
                } catch (Exception ex) {
                    inEM.getTransaction().rollback();
                } finally {
                    if (inEM.getTransaction().isActive()) {
                        inEM.close();
                    }
                }
            }
        }
    }
}