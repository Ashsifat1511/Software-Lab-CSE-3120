package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RAMTest {

    @Test
    void readMemory() {
        RAM ram = new RAM(5);
        ram.writeMemory(1, 10);
        assertEquals(10, ram.readMemory(1));
    }

    @Test
    void writeMemory() {
        RAM ram = new RAM(5);
        ram.writeMemory(1, 10);
        assertEquals(10, ram.readMemory(1));
    }

    @Test
    void updateAccessRate() {
        RAM ram = new RAM(5);
        ram.writeMemory(1, 10);
        ram.readMemory(1);
        ram.readMemory(1);
        ram.readMemory(1);
        ram.readMemory(1);
        ram.readMemory(1);
        ram.updateAccessRate();
        assertEquals(11, ram.readMemory(1));
    }
}