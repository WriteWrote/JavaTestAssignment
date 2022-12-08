package test.eo.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@RequiredArgsConstructor
public class CreateTypeDto {
    @JsonProperty("name")
    @NotEmpty
    @Size(min = 1, max = 50, message = "typename must b from 1 to 50 chars")
    private String name;
}
