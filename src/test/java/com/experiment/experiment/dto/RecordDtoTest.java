package com.experiment.experiment.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.junit.jupiter.api.Test;

class RecordDtoTest {

    @Test
    void deserialize() throws JsonProcessingException {
        final var objectMapper = JsonMapper.builder().build();

        final var recordDto = objectMapper.readValue("""
            {
            "age": 18,
            "firstName": "tester",
            "lastName": "test"
            }""", RecordDto.class);

        assertEquals(RecordDto.builder()
            .age(18)
            .firstName("tester")
            .lastName("test")
            .build(), recordDto);
    }

    @Test
    void serialize() throws JsonProcessingException {
        final var objectMapper = JsonMapper.builder().build();

        final var json = objectMapper.writeValueAsString(RecordDto.builder()
            .age(18)
            .firstName("tester")
            .lastName("test")
            .build());

        assertEquals("""
            {"age":18,"firstName":"tester","lastName":"test"}""", json);
    }
}
