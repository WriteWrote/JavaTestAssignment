package test.eo.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.eo.service.logic.impl.TypeService;
import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.GetTypeDto;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {
    private final TypeService service;

    @Autowired
    public TypeController(TypeService service) {
        this.service = service;
    }

    @PostMapping()
    public GetTypeDto createType(@RequestBody CreateTypeDto dto){
        return service.createType(dto);
    }

    @GetMapping
    public List<GetTypeDto> getAllTypes(){
        return service.getAllTypes();
    }

    @GetMapping("/{id}")
    public GetTypeDto getTypeById(@PathVariable Integer id){
        return service.getTypeById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteTypeById(@PathVariable Integer id){
        service.deleteTypeById(id);
    }
}
