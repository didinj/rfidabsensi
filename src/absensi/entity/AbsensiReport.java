/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DIDIN
 */
@Entity
public class AbsensiReport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nik;
    private String nama;
    private String bulan;
    private String tahun;
    private String masuk1;
    private String keluar1;
    private String ket1;
    private String masuk2;
    private String keluar2;
    private String ket2;
    private String masuk3;
    private String keluar3;
    private String ket3;
    private String masuk4;
    private String keluar4;
    private String ket4;
    private String masuk5;
    private String keluar5;
    private String ket5;
    private String masuk6;
    private String keluar6;
    private String ket6;
    private String masuk7;
    private String keluar7;
    private String ket7;
    private String masuk8;
    private String keluar8;
    private String ket8;
    private String masuk9;
    private String keluar9;
    private String ket9;
    private String masuk10;
    private String keluar10;
    private String ket10;
    private String masuk11;
    private String keluar11;
    private String ket11;
    private String masuk12;
    private String keluar12;
    private String ket12;
    private String masuk13;
    private String keluar13;
    private String ket13;
    private String masuk14;
    private String keluar14;
    private String ket14;
    private String masuk15;
    private String keluar15;
    private String ket15;
    private String masuk16;
    private String keluar16;
    private String ket16;
    private String masuk17;
    private String keluar17;
    private String ket17;
    private String masuk18;
    private String keluar18;
    private String ket18;
    private String masuk19;
    private String keluar19;
    private String ket19;
    private String masuk20;
    private String keluar20;
    private String ket20;
    private String masuk21;
    private String keluar21;
    private String ket21;
    private String masuk22;
    private String keluar22;
    private String ket22;
    private String masuk23;
    private String keluar23;
    private String ket23;
    private String masuk24;
    private String keluar24;
    private String ket24;
    private String masuk25;
    private String keluar25;
    private String ket25;
    private String masuk26;
    private String keluar26;
    private String ket26;
    private String masuk27;
    private String keluar27;
    private String ket27;
    private String masuk28;
    private String keluar28;
    private String ket28;
    private String masuk29;
    private String keluar29;
    private String ket29;
    private String masuk30;
    private String keluar30;
    private String ket30;
    private String masuk31;
    private String keluar31;
    private String ket31;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getKeluar1() {
        return keluar1;
    }

    public void setKeluar1(String keluar1) {
        this.keluar1 = keluar1;
    }

    public String getKeluar10() {
        return keluar10;
    }

    public void setKeluar10(String keluar10) {
        this.keluar10 = keluar10;
    }

    public String getKeluar11() {
        return keluar11;
    }

    public void setKeluar11(String keluar11) {
        this.keluar11 = keluar11;
    }

    public String getKeluar12() {
        return keluar12;
    }

    public void setKeluar12(String keluar12) {
        this.keluar12 = keluar12;
    }

    public String getKeluar13() {
        return keluar13;
    }

    public void setKeluar13(String keluar13) {
        this.keluar13 = keluar13;
    }

    public String getKeluar14() {
        return keluar14;
    }

    public void setKeluar14(String keluar14) {
        this.keluar14 = keluar14;
    }

    public String getKeluar15() {
        return keluar15;
    }

    public void setKeluar15(String keluar15) {
        this.keluar15 = keluar15;
    }

    public String getKeluar16() {
        return keluar16;
    }

    public void setKeluar16(String keluar16) {
        this.keluar16 = keluar16;
    }

    public String getKeluar17() {
        return keluar17;
    }

    public void setKeluar17(String keluar17) {
        this.keluar17 = keluar17;
    }

    public String getKeluar18() {
        return keluar18;
    }

    public void setKeluar18(String keluar18) {
        this.keluar18 = keluar18;
    }

    public String getKeluar19() {
        return keluar19;
    }

    public void setKeluar19(String keluar19) {
        this.keluar19 = keluar19;
    }

    public String getKeluar2() {
        return keluar2;
    }

    public void setKeluar2(String keluar2) {
        this.keluar2 = keluar2;
    }

    public String getKeluar20() {
        return keluar20;
    }

    public void setKeluar20(String keluar20) {
        this.keluar20 = keluar20;
    }

    public String getKeluar21() {
        return keluar21;
    }

    public void setKeluar21(String keluar21) {
        this.keluar21 = keluar21;
    }

    public String getKeluar22() {
        return keluar22;
    }

    public void setKeluar22(String keluar22) {
        this.keluar22 = keluar22;
    }

    public String getKeluar23() {
        return keluar23;
    }

    public void setKeluar23(String keluar23) {
        this.keluar23 = keluar23;
    }

    public String getKeluar24() {
        return keluar24;
    }

    public void setKeluar24(String keluar24) {
        this.keluar24 = keluar24;
    }

    public String getKeluar25() {
        return keluar25;
    }

    public void setKeluar25(String keluar25) {
        this.keluar25 = keluar25;
    }

    public String getKeluar26() {
        return keluar26;
    }

    public void setKeluar26(String keluar26) {
        this.keluar26 = keluar26;
    }

    public String getKeluar27() {
        return keluar27;
    }

    public void setKeluar27(String keluar27) {
        this.keluar27 = keluar27;
    }

    public String getKeluar28() {
        return keluar28;
    }

    public void setKeluar28(String keluar28) {
        this.keluar28 = keluar28;
    }

    public String getKeluar29() {
        return keluar29;
    }

    public void setKeluar29(String keluar29) {
        this.keluar29 = keluar29;
    }

    public String getKeluar3() {
        return keluar3;
    }

    public void setKeluar3(String keluar3) {
        this.keluar3 = keluar3;
    }

    public String getKeluar30() {
        return keluar30;
    }

    public void setKeluar30(String keluar30) {
        this.keluar30 = keluar30;
    }

    public String getKeluar31() {
        return keluar31;
    }

    public void setKeluar31(String keluar31) {
        this.keluar31 = keluar31;
    }

    public String getKeluar4() {
        return keluar4;
    }

    public void setKeluar4(String keluar4) {
        this.keluar4 = keluar4;
    }

    public String getKeluar5() {
        return keluar5;
    }

    public void setKeluar5(String keluar5) {
        this.keluar5 = keluar5;
    }

    public String getKeluar6() {
        return keluar6;
    }

    public void setKeluar6(String keluar6) {
        this.keluar6 = keluar6;
    }

    public String getKeluar7() {
        return keluar7;
    }

    public void setKeluar7(String keluar7) {
        this.keluar7 = keluar7;
    }

    public String getKeluar8() {
        return keluar8;
    }

    public void setKeluar8(String keluar8) {
        this.keluar8 = keluar8;
    }

    public String getKeluar9() {
        return keluar9;
    }

    public void setKeluar9(String keluar9) {
        this.keluar9 = keluar9;
    }

    public String getKet1() {
        return ket1;
    }

    public void setKet1(String ket1) {
        this.ket1 = ket1;
    }

    public String getKet10() {
        return ket10;
    }

    public void setKet10(String ket10) {
        this.ket10 = ket10;
    }

    public String getKet11() {
        return ket11;
    }

    public void setKet11(String ket11) {
        this.ket11 = ket11;
    }

    public String getKet12() {
        return ket12;
    }

    public void setKet12(String ket12) {
        this.ket12 = ket12;
    }

    public String getKet13() {
        return ket13;
    }

    public void setKet13(String ket13) {
        this.ket13 = ket13;
    }

    public String getKet14() {
        return ket14;
    }

    public void setKet14(String ket14) {
        this.ket14 = ket14;
    }

    public String getKet15() {
        return ket15;
    }

    public void setKet15(String ket15) {
        this.ket15 = ket15;
    }

    public String getKet16() {
        return ket16;
    }

    public void setKet16(String ket16) {
        this.ket16 = ket16;
    }

    public String getKet17() {
        return ket17;
    }

    public void setKet17(String ket17) {
        this.ket17 = ket17;
    }

    public String getKet18() {
        return ket18;
    }

    public void setKet18(String ket18) {
        this.ket18 = ket18;
    }

    public String getKet19() {
        return ket19;
    }

    public void setKet19(String ket19) {
        this.ket19 = ket19;
    }

    public String getKet2() {
        return ket2;
    }

    public void setKet2(String ket2) {
        this.ket2 = ket2;
    }

    public String getKet20() {
        return ket20;
    }

    public void setKet20(String ket20) {
        this.ket20 = ket20;
    }

    public String getKet21() {
        return ket21;
    }

    public void setKet21(String ket21) {
        this.ket21 = ket21;
    }

    public String getKet22() {
        return ket22;
    }

    public void setKet22(String ket22) {
        this.ket22 = ket22;
    }

    public String getKet23() {
        return ket23;
    }

    public void setKet23(String ket23) {
        this.ket23 = ket23;
    }

    public String getKet24() {
        return ket24;
    }

    public void setKet24(String ket24) {
        this.ket24 = ket24;
    }

    public String getKet25() {
        return ket25;
    }

    public void setKet25(String ket25) {
        this.ket25 = ket25;
    }

    public String getKet26() {
        return ket26;
    }

    public void setKet26(String ket26) {
        this.ket26 = ket26;
    }

    public String getKet27() {
        return ket27;
    }

    public void setKet27(String ket27) {
        this.ket27 = ket27;
    }

    public String getKet28() {
        return ket28;
    }

    public void setKet28(String ket28) {
        this.ket28 = ket28;
    }

    public String getKet29() {
        return ket29;
    }

    public void setKet29(String ket29) {
        this.ket29 = ket29;
    }

    public String getKet3() {
        return ket3;
    }

    public void setKet3(String ket3) {
        this.ket3 = ket3;
    }

    public String getKet30() {
        return ket30;
    }

    public void setKet30(String ket30) {
        this.ket30 = ket30;
    }

    public String getKet31() {
        return ket31;
    }

    public void setKet31(String ket31) {
        this.ket31 = ket31;
    }

    public String getKet4() {
        return ket4;
    }

    public void setKet4(String ket4) {
        this.ket4 = ket4;
    }

    public String getKet5() {
        return ket5;
    }

    public void setKet5(String ket5) {
        this.ket5 = ket5;
    }

    public String getKet6() {
        return ket6;
    }

    public void setKet6(String ket6) {
        this.ket6 = ket6;
    }

    public String getKet7() {
        return ket7;
    }

    public void setKet7(String ket7) {
        this.ket7 = ket7;
    }

    public String getKet8() {
        return ket8;
    }

    public void setKet8(String ket8) {
        this.ket8 = ket8;
    }

    public String getKet9() {
        return ket9;
    }

    public void setKet9(String ket9) {
        this.ket9 = ket9;
    }

    public String getMasuk1() {
        return masuk1;
    }

    public void setMasuk1(String masuk1) {
        this.masuk1 = masuk1;
    }

    public String getMasuk10() {
        return masuk10;
    }

    public void setMasuk10(String masuk10) {
        this.masuk10 = masuk10;
    }

    public String getMasuk11() {
        return masuk11;
    }

    public void setMasuk11(String masuk11) {
        this.masuk11 = masuk11;
    }

    public String getMasuk12() {
        return masuk12;
    }

    public void setMasuk12(String masuk12) {
        this.masuk12 = masuk12;
    }

    public String getMasuk13() {
        return masuk13;
    }

    public void setMasuk13(String masuk13) {
        this.masuk13 = masuk13;
    }

    public String getMasuk14() {
        return masuk14;
    }

    public void setMasuk14(String masuk14) {
        this.masuk14 = masuk14;
    }

    public String getMasuk15() {
        return masuk15;
    }

    public void setMasuk15(String masuk15) {
        this.masuk15 = masuk15;
    }

    public String getMasuk16() {
        return masuk16;
    }

    public void setMasuk16(String masuk16) {
        this.masuk16 = masuk16;
    }

    public String getMasuk17() {
        return masuk17;
    }

    public void setMasuk17(String masuk17) {
        this.masuk17 = masuk17;
    }

    public String getMasuk18() {
        return masuk18;
    }

    public void setMasuk18(String masuk18) {
        this.masuk18 = masuk18;
    }

    public String getMasuk19() {
        return masuk19;
    }

    public void setMasuk19(String masuk19) {
        this.masuk19 = masuk19;
    }

    public String getMasuk2() {
        return masuk2;
    }

    public void setMasuk2(String masuk2) {
        this.masuk2 = masuk2;
    }

    public String getMasuk20() {
        return masuk20;
    }

    public void setMasuk20(String masuk20) {
        this.masuk20 = masuk20;
    }

    public String getMasuk21() {
        return masuk21;
    }

    public void setMasuk21(String masuk21) {
        this.masuk21 = masuk21;
    }

    public String getMasuk22() {
        return masuk22;
    }

    public void setMasuk22(String masuk22) {
        this.masuk22 = masuk22;
    }

    public String getMasuk23() {
        return masuk23;
    }

    public void setMasuk23(String masuk23) {
        this.masuk23 = masuk23;
    }

    public String getMasuk24() {
        return masuk24;
    }

    public void setMasuk24(String masuk24) {
        this.masuk24 = masuk24;
    }

    public String getMasuk25() {
        return masuk25;
    }

    public void setMasuk25(String masuk25) {
        this.masuk25 = masuk25;
    }

    public String getMasuk26() {
        return masuk26;
    }

    public void setMasuk26(String masuk26) {
        this.masuk26 = masuk26;
    }

    public String getMasuk27() {
        return masuk27;
    }

    public void setMasuk27(String masuk27) {
        this.masuk27 = masuk27;
    }

    public String getMasuk28() {
        return masuk28;
    }

    public void setMasuk28(String masuk28) {
        this.masuk28 = masuk28;
    }

    public String getMasuk29() {
        return masuk29;
    }

    public void setMasuk29(String masuk29) {
        this.masuk29 = masuk29;
    }

    public String getMasuk3() {
        return masuk3;
    }

    public void setMasuk3(String masuk3) {
        this.masuk3 = masuk3;
    }

    public String getMasuk30() {
        return masuk30;
    }

    public void setMasuk30(String masuk30) {
        this.masuk30 = masuk30;
    }

    public String getMasuk31() {
        return masuk31;
    }

    public void setMasuk31(String masuk31) {
        this.masuk31 = masuk31;
    }

    public String getMasuk4() {
        return masuk4;
    }

    public void setMasuk4(String masuk4) {
        this.masuk4 = masuk4;
    }

    public String getMasuk5() {
        return masuk5;
    }

    public void setMasuk5(String masuk5) {
        this.masuk5 = masuk5;
    }

    public String getMasuk6() {
        return masuk6;
    }

    public void setMasuk6(String masuk6) {
        this.masuk6 = masuk6;
    }

    public String getMasuk7() {
        return masuk7;
    }

    public void setMasuk7(String masuk7) {
        this.masuk7 = masuk7;
    }

    public String getMasuk8() {
        return masuk8;
    }

    public void setMasuk8(String masuk8) {
        this.masuk8 = masuk8;
    }

    public String getMasuk9() {
        return masuk9;
    }

    public void setMasuk9(String masuk9) {
        this.masuk9 = masuk9;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
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
        if (!(object instanceof AbsensiReport)) {
            return false;
        }
        AbsensiReport other = (AbsensiReport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "absensi.entity.AbsensiReport[ id=" + id + " ]";
    }
    
}
