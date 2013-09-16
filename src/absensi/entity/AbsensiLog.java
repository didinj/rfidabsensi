/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class AbsensiLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nik;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    private String jammasuk;
    private String jamkeluar;
    private String keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJamkeluar() {
        return jamkeluar;
    }

    public void setJamkeluar(String jamkeluar) {
        this.jamkeluar = jamkeluar;
    }

    public String getJammasuk() {
        return jammasuk;
    }

    public void setJammasuk(String jammasuk) {
        this.jammasuk = jammasuk;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
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
        if (!(object instanceof AbsensiLog)) {
            return false;
        }
        AbsensiLog other = (AbsensiLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "absensi.entity.AbsensiLog[ id=" + id + " ]";
    }
    
}
