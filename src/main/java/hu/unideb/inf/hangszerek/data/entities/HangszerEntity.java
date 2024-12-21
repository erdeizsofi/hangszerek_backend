package hu.unideb.inf.hangszerek.data.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "hangszer")
public class HangszerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nev", nullable = false)
    private String nev;
    @Column(name = "leiras")
    private String leiras;
    @Column(name = "tipus")
    private String tipus;
    @Column(name = "kep_url")
    private String kep_url;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jatszik_hangszer",
            joinColumns = {@JoinColumn(name = "hangszer_id")} ,
            inverseJoinColumns = {@JoinColumn(name = "felhasznalo_id")}
    )
    private List<FelhasznaloEntity> felhasznaloEntities;


    public HangszerEntity() {
    }

    public HangszerEntity(long id, String nev, String leiras, String tipus, String kep_url) {
        this.id = id;
        this.nev = nev;
        this.leiras = leiras;
        this.tipus = tipus;
        this.kep_url = kep_url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
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
        HangszerEntity that = (HangszerEntity) o;
        return id == that.id && Objects.equals(nev, that.nev) && Objects.equals(leiras, that.leiras) && Objects.equals(tipus, that.tipus) && Objects.equals(kep_url, that.kep_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, leiras, tipus, kep_url);
    }
}
