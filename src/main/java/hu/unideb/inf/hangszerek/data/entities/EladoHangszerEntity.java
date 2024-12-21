package hu.unideb.inf.hangszerek.data.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "elado_hangszer")
public class EladoHangszerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tulajId")
    private Long tulajId;
    @Column(name = "hangszerId")
    private Long hangszerId;
    @Column(name = "ar")
    private Integer ar;
    @Column(name = "leiras")
    private String leiras;
    @Column(name = "kep_url")
    private String kep_url;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tulaj_azon", referencedColumnName = "id")
    private FelhasznaloEntity felhasznalo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hangszer_azon", referencedColumnName = "id")
    private HangszerEntity hangszer;

    public EladoHangszerEntity() {}

    public EladoHangszerEntity(Long id, Long tulajId, Long hangszerId, Integer ar, String leiras, String kep_url, FelhasznaloEntity felhasznalo, HangszerEntity hangszer) {
        this.id = id;
        this.tulajId = tulajId;
        this.hangszerId = hangszerId;
        this.ar = ar;
        this.leiras = leiras;
        this.kep_url = kep_url;
        this.felhasznalo = felhasznalo;
        this.hangszer = hangszer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTulajId() {
        return tulajId;
    }

    public void setTulajId(Long tulajId) {
        this.tulajId = tulajId;
    }

    public Long getHangszerId() {
        return hangszerId;
    }

    public void setHangszerId(Long hangszerId) {
        this.hangszerId = hangszerId;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public String getKep_url() {
        return kep_url;
    }

    public void setKep_url(String kep_url) {
        this.kep_url = kep_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EladoHangszerEntity that = (EladoHangszerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(tulajId, that.tulajId) && Objects.equals(hangszerId, that.hangszerId) && Objects.equals(ar, that.ar) && Objects.equals(leiras, that.leiras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tulajId, hangszerId, ar, leiras);
    }
}
