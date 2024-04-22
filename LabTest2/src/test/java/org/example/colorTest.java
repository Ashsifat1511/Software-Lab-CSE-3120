package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class colorTest {

    private color c = new color("Red");
    @Test
    void showcolor() {
        assertEquals("Red", c.getColor());
    }

    @Test
    void getColor() {
        assertEquals("Red", c.getColor());
    }
}