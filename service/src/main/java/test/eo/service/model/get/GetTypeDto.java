package test.eo.service.model.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class GetTypeDto {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    @NotEmpty
    @Size(min = 1, max = 50, message = "typename must b from 1 to 50 chars")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
