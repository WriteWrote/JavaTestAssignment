package test.eo.service.model.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class DocumentDto {

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

    @JsonProperty("serial")
    private Integer serialNumber;

    @JsonProperty("linkedto")
    private List<Integer> linkedDocsSerialNumbers;

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

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<Integer> getLinkedDocsSerialNumbers() {
        return linkedDocsSerialNumbers;
    }

    public void setLinkedDocsSerialNumbers(List<Integer> linkedDocsSerialNumbers) {
        this.linkedDocsSerialNumbers = linkedDocsSerialNumbers;
    }
}
