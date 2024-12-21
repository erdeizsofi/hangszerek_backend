package hu.unideb.inf.hangszerek.service.dto;

import java.util.Objects;


public class HangszerDto {

    private long id;
    private String nev;
    private String tipus;
    private String leiras;
    private String kep_url;

    public HangszerDto() {
    }

    public HangszerDto(long id, String nev, String tipus, String leiras, String kep_url) {
        this.id = id;
        this.nev = nev;
        this.tipus = tipus;
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

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
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
        HangszerDto that = (HangszerDto) o;
        return id == that.id && Objects.equals(nev, that.nev) && Objects.equals(tipus, that.tipus) && Objects.equals(leiras, that.leiras) && Objects.equals(kep_url, that.kep_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, tipus, leiras, kep_url);
    }

}
