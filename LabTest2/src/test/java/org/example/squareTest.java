package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class squareTest {

    private square s = new square(5);
    @Test
    void area() {
        double ans = 5*5;
        assertEquals(ans, s.Area());
    }

    @Test
    void perimeter() {
        double ans = 4*5;
        assertEquals(ans, s.Perimeter());
    }

    @Test
    void setColor() {
        s.setColor("Red");
        assertEquals("Red", s.color);
    }

    @Test
    void showColor() {
        s.setColor("Red");
        assertEquals("Red", s.showColor());
    }
}