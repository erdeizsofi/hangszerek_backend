package hu.unideb.inf.hangszerek.service.dto;

import java.util.Objects;

public class AnyagDto {

    private Long id;
    private String nev;

    public AnyagDto() {}

    public AnyagDto(Long id, String nev) {
        this.id = id;
        this.nev = nev;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        AnyagDto anyagDto = (AnyagDto) o;
        return Objects.equals(id, anyagDto.id) && Objects.equals(nev, anyagDto.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev);
    }
}
