package test.eo.service.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import test.eo.db.entities.DocumentEntity;
import test.eo.db.repositories.DocumentRepository;
import test.eo.service.mapper.IDocumentMapper;
import test.eo.service.model.get.DocumentDto;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DocumentMapper implements IDocumentMapper {
    private final DocumentRepository rep;

    @Override
    public DocumentDto fromEntity(DocumentEntity entity) {
        DocumentDto dto = new DocumentDto();

        dto.setSerialNumber(entity.getSerialNumber());
        dto.setDocumentType(entity.getDocumentType());
        dto.setHeader(entity.getHeader());
        dto.setText(entity.getText());

        dto.setLinkedDocsSerialNumbers(new ArrayList<>());
        for (var e :
                entity.getLinkedDocs()) {
            dto.getLinkedDocsSerialNumbers().add(e.getSerialNumber());
        }

        return dto;
    }

    @Override
    public DocumentEntity toEntity(DocumentDto dto) {
        DocumentEntity entity = new DocumentEntity();
        entity.setDocumentType(dto.getDocumentType());
        entity.setHeader(dto.getHeader());
        entity.setText(dto.getText());
        entity.setSerialNumber(dto.getSerialNumber());

        entity.setLinkedDocs(new ArrayList<>());

        for (var d :
                dto.getLinkedDocsSerialNumbers()) {
            entity.getLinkedDocs().add(rep.findBySerialNumber(d));
        }

        return entity;
    }

    @Override
    public List<DocumentDto> fromEntities(Iterable<DocumentEntity> entities) {
        List<DocumentDto> list = new ArrayList<>();
        for (var e :
                entities) {
            DocumentDto dto = fromEntity(e);
            list.add(dto);
        }

        return list;
    }

    @Override
    public DocumentEntity merge(DocumentDto dtoLeft, DocumentDto dtoRight) {
        DocumentEntity entity = toEntity(dtoLeft);

        if (!Objects.equals(dtoLeft.getDocumentType(), dtoRight.getDocumentType())) {
            entity.setDocumentType(dtoRight.getDocumentType());
        }
        if (!Objects.equals(dtoLeft.getHeader(), dtoRight.getHeader())) {
            entity.setHeader(dtoRight.getHeader());
        }
        if (!Objects.equals(dtoLeft.getText(), dtoRight.getText())) {
            entity.setText(dtoRight.getText());
        }
        if (!Objects.equals(dtoLeft.getSerialNumber(), dtoRight.getSerialNumber())) {
            entity.setSerialNumber(dtoRight.getSerialNumber());
        }
        if (dtoLeft.getLinkedDocsSerialNumbers() != dtoRight.getLinkedDocsSerialNumbers()) {
            List<DocumentEntity> list = new ArrayList<>();
            for (var v :
                    dtoRight.getLinkedDocsSerialNumbers()) {
                list.add(rep.findBySerialNumber(v));
            }
            entity.setLinkedDocs(list);
        }

        return entity;
    }
}
