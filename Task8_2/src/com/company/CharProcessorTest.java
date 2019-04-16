package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharProcessorTest {
    private String genericInput = "abcdef";
    private String genericExpected = "[a, b, c, d, e, f]";

    @Test
    void forwardArray() {
        CharProcessor processor = new CharProcessor(genericInput);
        assertEquals(genericExpected, processor.getForwardArrayString());
    }

    @Test
    void reverseArray() {
        CharProcessor processor = new CharProcessor(genericInput);
        assertEquals("[f, e, d, c, b, a]", processor.getReverseArrayString());
    }

    @Test
    void forwardString() {
        CharProcessor processor = new CharProcessor(genericInput);
        assertEquals(genericInput, processor.getForwardString());
    }

    @Test
    void reverseString() {
        CharProcessor processor = new CharProcessor(genericInput);
        assertEquals("fedcba", processor.getReverseString());
    }

    @Test
    void testNumbers() {
        String input = "123456";
        CharProcessor processor = new CharProcessor(input);
        assertEquals("[1, 2, 3, 4, 5, 6]", processor.getForwardArrayString());
    }

    @Test
    void testSpaces() {
        String input = "a b c d e f";
        CharProcessor processor = new CharProcessor(input);
        assertEquals(genericExpected, processor.getForwardArrayString());
    }

    @Test
    void testTabs() {
        String input = "ab  cdef";
        CharProcessor processor = new CharProcessor(input);
        assertEquals(genericExpected, processor.getForwardArrayString());
    }

    @Test
    void testNewlines() {
        String input = "abc\ndef";
        CharProcessor processor = new CharProcessor(input);
        assertEquals(genericExpected, processor.getForwardArrayString());
    }

    @Test
    void testSpecialChars() {
        String input = "!@#$%^&*()_-+=";
        String expected = "[!, @, #, $, %, ^, &, *, (, ), _, -, +, =]";
        CharProcessor processor = new CharProcessor(input);
        assertEquals(expected, processor.getForwardArrayString());
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "[]";
        CharProcessor processor = new CharProcessor(input);
        assertEquals(expected, processor.getForwardArrayString());
    }
}