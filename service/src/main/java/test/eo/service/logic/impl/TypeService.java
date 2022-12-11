package test.eo.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import test.eo.db.repositories.TypeRepository;
import test.eo.service.logic.ITypeService;
import test.eo.service.mapper.TypeMapper;
import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.GetTypeDto;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class TypeService implements ITypeService {

    private final TypeRepository rep;
    private final TypeMapper mapper;

    @Autowired
    public TypeService(TypeRepository rep, TypeMapper mapper) {
        this.rep = rep;
        this.mapper = mapper;
    }


    @Override
    public GetTypeDto createType(CreateTypeDto dto) {
        return Optional.of(dto)
                .map(mapper::toEntity)
                .map(rep::save)
                .map(mapper::fromEntity)
                .orElseThrow()
                ;
    }

    @Override
    public GetTypeDto getTypeById(Integer id) {
        return rep.findById(id)
                .map(mapper::fromEntity)
                .orElseThrow();
    }

    @Override
    public void deleteTypeById(Integer id) {
        rep.deleteById(id);
    }

    @Override
    public List<GetTypeDto> getAllTypes() {
        return mapper.fromEntities(rep.findAll());
    }
}
