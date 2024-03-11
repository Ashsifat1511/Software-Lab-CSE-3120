package org.example;
import java.lang.Integer;
public class Cache {
    private Integer[] L1;
    private Integer[] L2;

    public Cache(int size) {
        L1 = new Integer[size];
        L2 = new Integer[2 * size];
    }

    public Integer readCache(int location) {
        if (L1[location] != null) {
            return L1[location];
        } else if (L2[location] != null) {
            return L2[location];
        } else {
            return null;
        }
    }

    public void writeCache(int location, int data, int accessRateThreshold) {
        if (accessRateThreshold == 5) {
            L1[location] = data;
        } else if (accessRateThreshold == 3) {
            L2[location] = data;
        }
    }
}