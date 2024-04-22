package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class triangleTest {

    private triangle t = new triangle(3,4,5);
    @Test
    void area() {
        double ans = 6;
        assertEquals(ans, t.Area());
    }

    @Test
    void perimeter() {
        double ans = 12;
        assertEquals(ans, t.Perimeter());
    }

    @Test
    void setColor() {
        t.setColor("Red");
        assertEquals("Red", t.color);
    }

    @Test
    void showColor() {
        t.setColor("Red");
        assertEquals("Red", t.showColor());
    }
}