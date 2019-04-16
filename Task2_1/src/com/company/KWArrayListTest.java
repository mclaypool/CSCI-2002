package com.company;

import static org.junit.jupiter.api.Assertions.*;

class KWArrayListTest {

    @org.junit.jupiter.api.Test
    void moveLastToFirst_size1() {
        KWArrayList<Integer> testList = new KWArrayList<>();
        testList.add(1);

        testList.moveLastToFirst();
        assertEquals(1, testList.get(0));
    }

    @org.junit.jupiter.api.Test
    void moveLastToFirst_size2() {
        KWArrayList<Integer> testList = new KWArrayList<>();
        testList.add(1);
        testList.add(2);

        testList.moveLastToFirst();
        assertEquals(2, testList.get(0));
    }

    @org.junit.jupiter.api.Test
    void moveLastToFirst_size5() {
        KWArrayList<String> testList = new KWArrayList<>();
        testList.add("one");
        testList.add("two");
        testList.add("three");
        testList.add("four");
        testList.add("five");

        testList.moveLastToFirst();
        assertEquals("five", testList.get(0));
    }
}
