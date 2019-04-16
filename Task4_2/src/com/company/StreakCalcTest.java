package com.company;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StreakCalcTest {
    @org.junit.jupiter.api.Test
    void testConvertingArrayList() {
        ArrayList testArray = new ArrayList();
        testArray.add(1);
        testArray.add("a");
        testArray.add("a");
        testArray.add("a");
        testArray.add(true);
        assertEquals(3, StreakCalc.longestStreak(testArray.toArray()));
    }

    @org.junit.jupiter.api.Test
    void testEmptyList() {
        Integer[] testArray = {};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testLessThanTwo() {
        Integer[] testArray = {10};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testObjectsNoStreak() {
        Object[] testArray = {true, "a", false, "B", 1};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testObjectsHasStreak() {
        Object[] testArray = {true, "a", "a", "a", 1};
        assertEquals(3, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testIntsNoStreak() {
        Integer[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testIntsHasStreak() {
        Integer[] testArray = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        assertEquals(4, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testBooleansNoStreak() {
        Boolean[] testArray = {true, false, true, false};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testBooleansHasStreak() {
        Boolean[] testArray = {true, true, true, false};
        assertEquals(3, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsUppercaseNoStreak() {
        String[] testArray = {"A", "B", "C", "D", "E"};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsUppercaseHasStreak() {
        String[] testArray = {"A", "B", "B", "B", "C"};
        assertEquals(3, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsLowercaseNoStreak() {
        String[] testArray = {"a", "b", "c", "d", "e"};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsLowercaseHasStreak() {
        String[] testArray = {"a", "b", "b", "b", "c"};
        assertEquals(3, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsMixedCaseNoStreak() {
        String[] testArray = {"A", "a", "A", "a", "A"};
        assertEquals(1, StreakCalc.longestStreak(testArray));
    }

    @org.junit.jupiter.api.Test
    void testStringsMixedCaseHasStreak() {
        String[] testArray = {"A", "a", "a", "a", "A"};
        assertEquals(3, StreakCalc.longestStreak(testArray));
    }
}