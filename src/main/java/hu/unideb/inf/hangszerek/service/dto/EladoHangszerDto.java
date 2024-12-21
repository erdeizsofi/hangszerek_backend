package hu.unideb.inf.hangszerek.service.dto;

import java.util.Objects;

public class EladoHangszerDto {

    private Long id;
    private Long tulajId;
    private Long hangszerId;
    private Integer ar;
    private String leiras;
    private String kep_url;

    public EladoHangszerDto() {}

    public EladoHangszerDto(Long id, Long tulajId, Long hangszerId, Integer ar, String leiras, String kep_url) {
        this.id = id;
        this.tulajId = tulajId;
        this.hangszerId = hangszerId;
        this.ar = ar;
        this.leiras = leiras;
        this.kep_url = kep_url;
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
        EladoHangszerDto that = (EladoHangszerDto) o;
        return Objects.equals(id, that.id) && Objects.equals(tulajId, that.tulajId) && Objects.equals(hangszerId, that.hangszerId) && Objects.equals(ar, that.ar) && Objects.equals(leiras, that.leiras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tulajId, hangszerId, ar, leiras);
    }
}
