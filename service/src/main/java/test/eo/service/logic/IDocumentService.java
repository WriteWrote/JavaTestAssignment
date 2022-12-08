package test.eo.service.logic;

import test.eo.service.model.create.CreateDocumentDto;
import test.eo.service.model.create.CreateTypeDto;
import test.eo.service.model.get.DocumentDto;

import java.util.List;

public interface IDocumentService {
    DocumentDto getDocumentById(Integer id);
    DocumentDto getdocumentBySerialNumber(Integer serial);

    CreateDocumentDto createDocument(CreateDocumentDto dto);

    List<DocumentDto> getallDocuments();
    void deleteDocumentById(Integer id);
    void deleteDocumentBySerialNumber(Integer serial);

    DocumentDto updateDocument(DocumentDto oldDoc);

    DocumentDto createLink(DocumentDto leftDoc, DocumentDto rightDoc);
}
