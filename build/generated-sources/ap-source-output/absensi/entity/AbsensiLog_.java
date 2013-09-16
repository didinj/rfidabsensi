package absensi.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-09-14T13:06:04")
@StaticMetamodel(AbsensiLog.class)
public class AbsensiLog_ { 

    public static volatile SingularAttribute<AbsensiLog, Long> id;
    public static volatile SingularAttribute<AbsensiLog, String> keterangan;
    public static volatile SingularAttribute<AbsensiLog, String> jammasuk;
    public static volatile SingularAttribute<AbsensiLog, Date> tanggal;
    public static volatile SingularAttribute<AbsensiLog, String> nik;
    public static volatile SingularAttribute<AbsensiLog, String> jamkeluar;

}