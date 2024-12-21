package hu.unideb.inf.hangszerek.service.dto;

import java.util.Objects;

public class VonosDto {

    private long id;
    private String nev;
    private String leiras;
    private String kep_url;

    public VonosDto(){}

    public VonosDto(long id, String nev, String leiras, String kep_url) {
        this.id = id;
        this.nev = nev;
        this.leiras = leiras;
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
        VonosDto vonosDto = (VonosDto) o;
        return id == vonosDto.id && Objects.equals(nev, vonosDto.nev) && Objects.equals(leiras, vonosDto.leiras) && Objects.equals(kep_url, vonosDto.kep_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, leiras, kep_url);
    }
}
