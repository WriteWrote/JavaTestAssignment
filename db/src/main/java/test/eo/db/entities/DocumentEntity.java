package test.eo.db.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "documents", schema = "test_assignment2022")
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doc_type")
    @NotNull(message = "Document type cannot be null")
    private Integer documentType;

    @Column(name = "header")
    @NotEmpty(message = "document header cannot be null|empty")
    private String header;

    @Column(name = "text")
    @NotEmpty(message = "document content(text) cannot be null|empty")
    private String text;

    @Column(name = "serial_number")
    @NotNull(message = "document serialNumber cannot be null")
    private Integer serialNumber;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "id_left", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_right", referencedColumnName = "id"),
            name = "links",
            schema = "test_assignment2022"
    )
    private List<DocumentEntity> linkedDocs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<DocumentEntity> getLinkedDocs() {
        return linkedDocs;
    }

    public void setLinkedDocs(List<DocumentEntity> linkedDocs) {
        this.linkedDocs = linkedDocs;
    }
}
