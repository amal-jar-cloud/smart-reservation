package com.smartreservation.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmokeTest {

    @Test
    void toolchainWorks() {
        assertEquals(17, Runtime.version().feature());
    }
}