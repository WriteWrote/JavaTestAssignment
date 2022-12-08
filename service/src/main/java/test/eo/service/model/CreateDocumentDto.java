package test.eo.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@RequiredArgsConstructor
public class CreateDocumentDto {

    @JsonProperty("doctype")
    private Integer documentType;

    @JsonProperty("header")
    @NotBlank
    @Size(min=1, max = 50, message = "Header must be from 1 to 50 chars")
    private String header;

    @JsonProperty("text")
    @NotBlank
    @Size(min=1, max = 1000, message = "Document text must be from 1 to 1000 chars")
    private String text;
    // serial number generates in service


    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
