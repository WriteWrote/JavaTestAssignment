package test.eo.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import test.eo.db.entities.DocumentEntity;
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
        return rep.findById(id)
                .map(map::fromEntity)
                .orElseThrow();
    }

    @Override
    public DocumentDto getDocumentBySerialNumber(Integer serial) {
        return map.fromEntity(rep.findBySerialNumber(serial));
    }

    @Override
    public DocumentDto createDocument(CreateDocumentDto dto) {
        return Optional.of(dto)
                .map(map::toEntity)
                .map(rep::save)
                .map(map::fromEntity)
                .orElseThrow();
    }

    @Override
    public List<DocumentDto> getAllDocuments() {
        return map.fromEntities(rep.findAll());
    }

    @Override
    public void deleteDocumentById(Integer id) {
        rep.deleteById(id);
    }

    @Override
    public void deleteDocumentBySerialNumber(Integer serial) {
        rep.deleteBySerialNumber(serial);
    }

    @Override
    public DocumentDto updateDocument(DocumentDto newDoc) {
        DocumentDto oldDoc = map.fromEntity(
                rep.findBySerialNumber(
                        newDoc.getSerialNumber()));
        DocumentEntity e = map.merge(oldDoc, newDoc);

        return Optional.of(e)
                .map(rep::save)
                .map(map::fromEntity)
                .orElseThrow();
    }

    @Override
    public DocumentDto createLink(DocumentDto leftDoc, DocumentDto rightDoc) {


        return null;
    }
}
