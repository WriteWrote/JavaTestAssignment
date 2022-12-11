package test.eo.service.logic;

import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.GetTypeDto;

import javax.validation.Valid;
import java.util.List;

public interface ITypeService {
    GetTypeDto createType(@Valid CreateTypeDto dto);

    GetTypeDto getTypeById(Integer id);

    void deleteTypeById(Integer id);

    List<GetTypeDto> getAllTypes();
}
