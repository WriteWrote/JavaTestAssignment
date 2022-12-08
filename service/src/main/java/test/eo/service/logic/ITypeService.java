package test.eo.service.logic;

import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.GetTypeDto;

import javax.validation.Valid;
import java.util.List;

public interface ITypeService {
    CreateTypeDto createDto(@Valid CreateTypeDto dto);

    GetTypeDto getDto(GetTypeDto dto);

    void deleteTypeById(Integer id);

    List<GetTypeDto> getAllTypes();
}
