package hu.unideb.inf.hangszerek.service.impl;

import hu.unideb.inf.hangszerek.data.entities.EladoHangszerEntity;
import hu.unideb.inf.hangszerek.data.entities.HangszerEntity;
import hu.unideb.inf.hangszerek.data.repositories.EladoHangszerRepository;
import hu.unideb.inf.hangszerek.data.repositories.HangszerRepository;
import hu.unideb.inf.hangszerek.service.EladoHangszerManagementService;
import hu.unideb.inf.hangszerek.service.HangszerManagementService;
import hu.unideb.inf.hangszerek.service.dto.FelhasznaloDto;
import hu.unideb.inf.hangszerek.service.dto.EladoHangszerDto;
import hu.unideb.inf.hangszerek.service.dto.VonosDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EladoHangszerManagementServiceImpl implements EladoHangszerManagementService {
    @Autowired
    EladoHangszerRepository repo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EladoHangszerDto save(EladoHangszerDto dto) {
        EladoHangszerEntity hangszerEntity = modelMapper.map(dto, EladoHangszerEntity.class);
        hangszerEntity = repo.save(hangszerEntity);

        return modelMapper.map(hangszerEntity, EladoHangszerDto.class);
    }

    @Override
    public List<EladoHangszerDto> findAll() {
        List<EladoHangszerEntity> list = repo.findAll();
        List<EladoHangszerDto> dtos = new ArrayList<>();

        dtos = modelMapper.map(list, new TypeToken<List<EladoHangszerDto>>(){}.getType());
        return dtos;
    }

    @Override
    public EladoHangszerDto findById(Long id) {
        EladoHangszerEntity entity = repo.findById(id).orElse(null);
        EladoHangszerDto dto = new EladoHangszerDto();

        dto.setId(entity.getId());
        dto.setTulajId(entity.getTulajId());
        dto.setHangszerId(entity.getHangszerId());
        dto.setLeiras(entity.getLeiras());
        dto.setKep_url(entity.getKep_url());
        dto.setAr(entity.getAr());


        return dto;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<EladoHangszerDto> findByHangszerId(Long id) {
        List<EladoHangszerEntity> list = repo.findAll().stream()
                .filter(e -> Objects.equals(e.getHangszerId(), id))
                .toList();
        List<EladoHangszerDto> dtos = new ArrayList<>();

        dtos = modelMapper.map(list, new TypeToken<List<EladoHangszerDto>>(){}.getType());
        return dtos;
    }
}
