package org.example;

public class RAM {
    private int[] memory;
    private int[] accessCount;

    public RAM(int size) {
        memory = new int[size];
        accessCount = new int[size];
    }

    public int readMemory(int location) {
        accessCount[location]++;
        return memory[location];
    }

    public void writeMemory(int location, int data) {
        memory[location] = data;
    }

    public void updateAccessRate() {
        for (int i = 0; i < accessCount.length; i++) {
            if (accessCount[i] >= 5) {
                accessCount[i] = 0;
                memory[i]++;
            }
        }
    }
}
