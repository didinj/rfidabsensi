/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class Employee implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nik;
    private String nama;
    private String jabatan;
    private String dept;
    private String rfid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        String oldDept = this.dept;
        this.dept = dept;
        changeSupport.firePropertyChange("dept", oldDept, dept);
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        String oldJabatan = this.jabatan;
        this.jabatan = jabatan;
        changeSupport.firePropertyChange("jabatan", oldJabatan, jabatan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        String oldNik = this.nik;
        this.nik = nik;
        changeSupport.firePropertyChange("nik", oldNik, nik);
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        String oldRfid = this.rfid;
        this.rfid = rfid;
        changeSupport.firePropertyChange("rfid", oldRfid, rfid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "absensi.entity.Employee[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
