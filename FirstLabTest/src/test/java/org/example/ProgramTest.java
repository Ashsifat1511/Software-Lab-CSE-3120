package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void accessMemory() {
        RAM ram = new RAM(5);
        Cache cache = new Cache(5);
        Program program = new Program(ram, cache);
        ram.writeMemory(1, 10);
        assertEquals(10, program.accessMemory(1));
    }
}