package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheTest {

    @Test
    void readCache() {
        Cache cache = new Cache(5);
        cache.writeCache(1, 10, 5);
        assertEquals(10, cache.readCache(1));
    }

    @Test
    void writeCache() {
        Cache cache = new Cache(5);
        cache.writeCache(1, 10, 5);
        assertEquals(10, cache.readCache(1));
    }
}