package test.eo.service.mapper;

import org.mapstruct.Mapper;
import test.eo.db.entities.TypeEntity;
import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.GetTypeDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    GetTypeDto fromEntity(TypeEntity entity);

    TypeEntity toEntity(GetTypeDto dto);

    List<GetTypeDto> fromEntities(Iterable<TypeEntity> entities);

}
