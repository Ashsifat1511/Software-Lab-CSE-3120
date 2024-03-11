package org.example;


public class Program {
    private RAM ram;
    private Cache cache;

    public Program(RAM ram, Cache cache) {
        this.ram = ram;
        this.cache = cache;
    }

    public int accessMemory(int location) {
        // Check Cache first
        Integer data = cache.readCache(location);

        if (data == null) {
            // If not in Cache, fetch from RAM
            data = ram.readMemory(location);
            // Update Cache
            cache.writeCache(location, data, 5);
        }

        return data;
    }
}