package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTestIT {

    private circle c = new circle(5);
    private color cl = new color("Red");
    @Test
    void colorset(){
        c.setColor(cl.getColor());
        assertEquals("Red", c.color);
    }
}