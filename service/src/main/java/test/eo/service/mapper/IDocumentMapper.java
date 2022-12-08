package test.eo.service.mapper;

import test.eo.db.entities.DocumentEntity;
import test.eo.service.model.get.DocumentDto;

import java.util.List;

public interface IDocumentMapper {
    DocumentDto fromEntity(DocumentEntity entity);

    DocumentEntity toEntity(DocumentDto dto);

    List<DocumentDto> fromEntities(Iterable<DocumentEntity> entities);

    DocumentEntity merge(DocumentDto dtoLeft, DocumentDto dtoRight);
}
