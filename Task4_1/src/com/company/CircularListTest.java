package com.company;

import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

    @org.junit.jupiter.api.Test
    void testDoesnNotHavePrviousAtStart() {
        CircularList list = new CircularList();
        list.add(1);

        ListIterator listIter = list.listIterator(0);
        assertEquals(false, listIter.hasPrevious());
    }

    @org.junit.jupiter.api.Test
    void testHasNextAtTail() {
        CircularList list = new CircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator listIter = list.listIterator(3);
        assertEquals(true, listIter.hasNext());
    }

    @org.junit.jupiter.api.Test
    void testNextAtTailGetRightValue() {
        CircularList list = new CircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator listIter = list.listIterator(4);
        assertEquals(1, listIter.next());
    }

    @org.junit.jupiter.api.Test
    void testLooping() {
        int[] actualValues = new int[8];

        CircularList list = new CircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator listIter = list.listIterator(0);

        for (int i = 0; i < actualValues.length; i++) {
            actualValues[i] = (int) listIter.next();
        }

        assertEquals(8, actualValues.length);
    }

    @org.junit.jupiter.api.Test
    void testCircularIndex() {
        try {
            CircularList list = new CircularList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);

            ListIterator listIter = list.listIterator(20);
            assertEquals(1, listIter.next());
        }
        catch (IndexOutOfBoundsException e){
            fail();
        }
    }

    @org.junit.jupiter.api.Test
    void testPreviousAtIndex() {
        CircularList list = new CircularList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator listIter = list.listIterator(18);
        assertEquals(2, listIter.previous());
    }
}