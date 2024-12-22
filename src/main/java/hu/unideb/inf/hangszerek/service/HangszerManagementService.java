package hu.unideb.inf.hangszerek.service;

import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;
import hu.unideb.inf.hangszerek.service.dto.HangszerDto;


import java.util.List;

public interface HangszerManagementService {

    HangszerDto save(HangszerDto dto);
    List<HangszerDto> findAll();
    HangszerDto findById(Long id);
    void delete(Long id);
    HangszerDto update(HangszerDto dto);

    List<HangszerDto> hangszerByTipus(String tipus);
    List<HangszerDto> hangszerByNev(String nev);
    List<FelhasznaloDto> felhasznaloByHangszerId(Long hangszerId);
    List<HangszerDto> hangszerByFelhasznaloId(Long FelhasznaloId);

    List<HangszerDto> hangszerByTipusDb(String tipus);
    List<HangszerDto> hangszerByParams(String nev, String tipus);


}
