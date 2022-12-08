package test.eo.service.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateDocumentDto {

    private Integer documentType;
    private String header;
    private String text;
    // serial number generates in service
}
