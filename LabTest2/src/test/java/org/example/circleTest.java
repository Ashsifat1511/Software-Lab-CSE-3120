package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class circleTest {

    private circle c = new circle(5);
    @Test
    void area() {
        double ans = 3.1416*5*5;
        assertEquals(ans, c.Area());
    }

    @Test
    void perimeter() {
        double ans = 2*3.1416*5;
        assertEquals(ans, c.Perimeter());
    }

    @Test
    void setColor() {
        c.setColor("Red");
        assertEquals("Red", c.color);
    }

    @Test
    void showColor() {
        c.setColor("Red");
        assertEquals("Red", c.showColor());
    }
}