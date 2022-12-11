package test.eo.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.eo.service.logic.impl.DocumentService;
import test.eo.service.model.create.CreateDocumentDto;
import test.eo.service.model.create.CreateLinkDto;
import test.eo.service.model.get.DocumentDto;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService service;

    @Autowired
    public DocumentController(DocumentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public DocumentDto getDocumentById(@PathVariable Integer id) {
        return service.getDocumentById(id);
    }

    @GetMapping("/{serial}")
    public DocumentDto getDocumentBySerialNumber(@PathVariable Integer serial) {
        return service.getDocumentBySerialNumber(serial);
    }

    @GetMapping("/all")
    public List<DocumentDto> getAllDocuments() {
        return service.getAllDocuments();
    }

    @PostMapping
    public DocumentDto createDocument(@RequestBody CreateDocumentDto dto) {
        return service.createDocument(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentById(@PathVariable Integer id) {
        service.deleteDocumentById(id);
    }

    @DeleteMapping("/{serial}")
    public void deleteDocumentBySerialNumber(@PathVariable Integer serial) {
        service.deleteDocumentBySerialNumber(serial);
    }

    @PutMapping()
    public DocumentDto updateDocument(@RequestBody DocumentDto dto) {
        return service.updateDocument(dto);
    }

    @PutMapping("/link")
    public void setLink(@RequestBody CreateLinkDto dto) {
        service.createLink(dto.getLeftSerial(), dto.getRightSerial());
    }
}
