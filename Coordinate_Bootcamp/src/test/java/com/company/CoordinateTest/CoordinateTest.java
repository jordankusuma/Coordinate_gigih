package com.company.CoordinateTest;

import com.company.java.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateTest {
    @Test
    void calculateX() {
        Coordinates coordinates = new Coordinates(3, 5, 4, 6);
        double result = coordinates.calculateX();
        assertEquals(2.0, result, 0.0);
    }
}
