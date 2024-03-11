package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Create a new RAM object with 1000 memory locations
        RAM ram = new RAM(1000);

        // Create a new Cache object with 100 memory locations
        Cache cache = new Cache(100);

        // Create a new Program object
        Program program = new Program(ram, cache);

    }

}