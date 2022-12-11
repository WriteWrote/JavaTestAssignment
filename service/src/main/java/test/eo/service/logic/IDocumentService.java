package test.eo.service.logic;

import test.eo.service.model.create.CreateDocumentDto;
import test.eo.service.model.get.DocumentDto;

import javax.validation.Valid;
import java.util.List;

public interface IDocumentService {
    DocumentDto getDocumentById(Integer id);
    DocumentDto getDocumentBySerialNumber(Integer serial);

    DocumentDto createDocument(@Valid CreateDocumentDto dto);

    List<DocumentDto> getAllDocuments();
    void deleteDocumentById(Integer id);
    void deleteDocumentBySerialNumber(Integer serial);

    DocumentDto updateDocument(@Valid DocumentDto newDoc);

    DocumentDto createLink(@Valid DocumentDto leftDoc, @Valid DocumentDto rightDoc);
}
