package com.experiment.experiment.dto;

import com.experiment.experiment.dto.RecordDto.RecordDtoBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;

@JsonDeserialize(builder = RecordDtoBuilder.class)
@Builder
record RecordDto(
    @JsonProperty("age")
    int age,
    @JsonProperty("firstName")
    String firstName,
    @JsonProperty("lastName")
    String lastName) {

}
