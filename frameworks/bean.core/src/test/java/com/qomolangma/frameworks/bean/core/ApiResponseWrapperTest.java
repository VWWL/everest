package com.qomolangma.frameworks.bean.core;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiResponseWrapperTest {
    @Test
    void should_get_empty_when_given_null() {
        Object response = new ApiResponseWrapper().beforeBodyWrite(null, null, null, null, null, null);
        assertEquals(Map.of("body", Map.of()), response);
    }

    @Test
    void should_get_self_when_given_not_responsePayload() {
        Object response = new ApiResponseWrapper().beforeBodyWrite(new NotResponsePayload(), null, null, null, null, null);
        assertThat(response).isInstanceOf(NotResponsePayload.class);
    }

    private static final class NotResponsePayload {
    }
}
