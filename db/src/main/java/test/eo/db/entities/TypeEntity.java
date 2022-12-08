package test.eo.db.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "types", schema = "test_assignment2022")
public class TypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer id;

    @Column(name = "type_name")
    @NotEmpty(message = "name of document type cannot be empty")
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
