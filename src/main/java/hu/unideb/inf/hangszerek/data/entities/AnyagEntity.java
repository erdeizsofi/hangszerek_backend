package hu.unideb.inf.hangszerek.data.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "anyag")
public class AnyagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nev", nullable = false)
    private String nev;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "hangszer_anyag",
            joinColumns = {@JoinColumn(name = "anyag_id")} ,
            inverseJoinColumns = {@JoinColumn(name = "hangszer_id")}
    )
    private List<HangszerEntity> hangszerEntities;


    public AnyagEntity() {}

    public AnyagEntity(long id, String nev) {
        this.id = id;
        this.nev = nev;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnyagEntity that = (AnyagEntity) o;
        return id == that.id && Objects.equals(nev, that.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev);
    }
}
