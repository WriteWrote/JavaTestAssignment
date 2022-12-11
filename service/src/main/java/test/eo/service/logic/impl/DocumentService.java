package test.eo.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import test.eo.db.repositories.DocumentRepository;
import test.eo.service.logic.IDocumentService;
import test.eo.service.mapper.impl.DocumentMapper;
import test.eo.service.model.create.CreateDocumentDto;
import test.eo.service.model.get.DocumentDto;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class DocumentService implements IDocumentService {
    private final DocumentRepository rep;

    private final DocumentMapper map;

    @Autowired
    public DocumentService(DocumentRepository rep, DocumentMapper map) {
        this.rep = rep;
        this.map = map;
    }

    @Override
    public DocumentDto getDocumentById(Integer id) {
        return Optional.of(re);
    }

    @Override
    public DocumentDto getDocumentBySerialNumber(Integer serial) {
        return null;
    }

    @Override
    public CreateDocumentDto createDocument(CreateDocumentDto dto) {
        return null;
    }

    @Override
    public List<DocumentDto> getAllDocuments() {
        return null;
    }

    @Override
    public void deleteDocumentById(Integer id) {

    }

    @Override
    public void deleteDocumentBySerialNumber(Integer serial) {

    }

    @Override
    public DocumentDto updateDocument(DocumentDto oldDoc) {
        return null;
    }

    @Override
    public DocumentDto createLink(DocumentDto leftDoc, DocumentDto rightDoc) {
        return null;
    }
}
