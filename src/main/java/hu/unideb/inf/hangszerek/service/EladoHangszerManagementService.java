package hu.unideb.inf.hangszerek.service;

import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;
import hu.unideb.inf.hangszerek.service.dto.EladoHangszerDto;

import java.util.List;

public interface EladoHangszerManagementService {

    EladoHangszerDto save(EladoHangszerDto dto);
    List<EladoHangszerDto> findAll();
    EladoHangszerDto findById(Long id);
    List<EladoHangszerDto> findByHangszerId(Long id);
    void delete(Long id);

}
