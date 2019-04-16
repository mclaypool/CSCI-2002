package com.company;

import static com.company.Main.recursive_sum;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void aGreaterThanB() {
        int a = 4;
        int b = 1;
        int expectedValue = 10;

        assertEquals(expectedValue, recursive_sum(a, b));
    }

    @org.junit.jupiter.api.Test
    void bGreaterThanA() {
        int a = 1;
        int b = 4;
        int expectedValue = 10;

        assertEquals(expectedValue, recursive_sum(a, b));
    }

    @org.junit.jupiter.api.Test
    void aEqualsB() {
        int a = 4;
        int b = 4;
        int expectedValue = 4;

        assertEquals(expectedValue, recursive_sum(a, b));
    }

    @org.junit.jupiter.api.Test
    void negitiveNumbers() {
        int a = -1;
        int b = -4;
        int expectedValue = -10;

        assertEquals(expectedValue, recursive_sum(a, b));
    }
}