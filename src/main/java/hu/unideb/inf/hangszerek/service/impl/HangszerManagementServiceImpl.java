package hu.unideb.inf.hangszerek.service.impl;

import hu.unideb.inf.hangszerek.data.entities.HangszerEntity;
import hu.unideb.inf.hangszerek.data.repositories.HangszerRepository;
import hu.unideb.inf.hangszerek.service.HangszerManagementService;
import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;
import hu.unideb.inf.hangszerek.service.dto.HangszerDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HangszerManagementServiceImpl implements HangszerManagementService {
    @Autowired
    HangszerRepository repo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public HangszerDto save(HangszerDto dto) {
        HangszerEntity hangszerEntity = modelMapper.map(dto, HangszerEntity.class);
        hangszerEntity = repo.save(hangszerEntity);

        return modelMapper.map(hangszerEntity, HangszerDto.class);
    }

    @Override
    public List<HangszerDto> findAll() {
        List<HangszerEntity> list = repo.findAll();
        List<HangszerDto> dtos = new ArrayList<>();

        dtos = modelMapper.map(list, new TypeToken<List<HangszerDto>>(){}.getType());
        return dtos;
    }

    @Override
    public HangszerDto findById(Long id) {
        HangszerEntity entity = repo.findById(id).orElse(null);
        HangszerDto dto = new HangszerDto();

        dto.setId(entity.getId());
        dto.setNev(entity.getNev());
        dto.setLeiras(entity.getLeiras());
        dto.setKep_url(entity.getKep_url());
        dto.setTipus(entity.getTipus());

        return dto;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public HangszerDto update(HangszerDto dto) {
        return null;
    }

    @Override
    public List<HangszerDto> hangszerByTipus(String tipus) {
        List<HangszerEntity> entities = repo.findAll().stream()
                .filter(x -> tipus == null || x.getTipus().equals(tipus))
                .toList();
        return modelMapper.map(entities, new TypeToken<List<HangszerDto>>(){}.getType());
    }

    @Override
    public List<HangszerDto> hangszerByNev(String nev) {
        List<HangszerEntity> entities = repo.findAll().stream()
                .filter(x -> nev == null || x.getNev().equals(nev))
                .toList();

        return modelMapper.map(entities, new TypeToken<List<HangszerDto>>(){}.getType());

    }

    @Override
    public List<FelhasznaloDto> felhasznaloByHangszerId(Long hangszerId) {
        return List.of();
    }

    @Override
    public List<HangszerDto> hangszerByFelhasznaloId(Long FelhasznaloId) {
        return List.of();
    }

    @Override
    public List<HangszerDto> hangszerByTipusDb(String tipus) {
        return modelMapper.map(repo.findAllByTipus(tipus), new TypeToken<List<HangszerDto>>(){}.getType());
    }

    @Override
    public List<HangszerDto> hangszerByParams(String nev, String tipus) {

        List<HangszerEntity> entities = repo.findAll().stream()
                .filter(x -> nev == null || x.getNev().equals(nev))
                .filter(x -> tipus == null || x.getTipus().equals(tipus))
                .toList();

        return modelMapper.map(entities, new TypeToken<List<HangszerDto>>(){}.getType());
    }
}
