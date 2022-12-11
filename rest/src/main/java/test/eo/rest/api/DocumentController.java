package test.eo.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.eo.service.logic.impl.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService service;

    @Autowired
    public DocumentController(DocumentService service) {
        this.service = service;
    }


}
