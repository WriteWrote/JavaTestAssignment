package test.eo.service.model.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateLinkDto {
    @JsonProperty
    private Integer leftSerial;
    @JsonProperty
    private Integer rightSerial;

    public Integer getLeftSerial() {
        return leftSerial;
    }

    public void setLeftSerial(Integer leftSerial) {
        this.leftSerial = leftSerial;
    }

    public Integer getRightSerial() {
        return rightSerial;
    }

    public void setRightSerial(Integer rightSerial) {
        this.rightSerial = rightSerial;
    }
}
