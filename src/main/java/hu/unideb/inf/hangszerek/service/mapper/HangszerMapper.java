package hu.unideb.inf.hangszerek.service.mapper;

import hu.unideb.inf.hangszerek.data.entities.HangszerEntity;
import hu.unideb.inf.hangszerek.service.dto.HangszerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HangszerMapper {

    @Mapping(target = "id", source = "id")
    HangszerDto rendelesEntityToDto(HangszerEntity entity);
    List<HangszerDto> rendelesEntityListToDtoList(List<HangszerEntity> entities);

    HangszerEntity hangszerDtoToEntity(HangszerDto dto);
    List<HangszerEntity> rendelesDtoListToEntityList(List<HangszerDto> dtos);

}
