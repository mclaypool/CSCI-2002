package test;

import com.company.LinkedStack;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    @Test
    void manualEntry() {
        LinkedStack stack = new LinkedStack();
        // add code here. See other unit tests for options
    }

    @Test
    void emptyConstructor() {
        LinkedStack stack = new LinkedStack();
        assertTrue(stack.empty());
    }

    @Test
    void constructorWithValue() {
        int expectedValue = 8;
        LinkedStack stack = new LinkedStack(expectedValue);
        assertEquals(expectedValue, stack.pop());
    }

    @Test
    void push() {
        int expectedValue = 8;
        LinkedStack stack = new LinkedStack();
        stack.push(expectedValue);
        assertEquals(expectedValue, stack.pop());
    }

    @Test
    void pop() {
        LinkedStack stack = new LinkedStack();
        stack.push(8);
        stack.pop();
        assertTrue(stack.empty());
    }

    @Test
    void popError() {
        LinkedStack stack = new LinkedStack();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void peek() {
        int expectedValue = 8;
        LinkedStack stack = new LinkedStack();
        stack.push(expectedValue);
        assertEquals(expectedValue, stack.peek());
    }

    @Test
    void peekError() {
        LinkedStack stack = new LinkedStack();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    void isFull() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertTrue(stack.isFull());
    }

    @Test
    void isNotFull() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        assertFalse(stack.isFull());
    }

    @Test
    void empty() {
        LinkedStack stack = new LinkedStack();
        assertTrue(stack.empty());
    }

    @Test
    void reInitializeIsEmpty() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.reInitialize();
        assertTrue(stack.empty());
    }
    @Test
    void reInitializeCount() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.reInitialize();
        assertEquals(0, stack.getCount());
    }

    @Test
    void reInitializeMaxNodes() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.reInitialize();
        assertEquals(5, stack.getMaxNodes());
    }

    @Test
    void justConstructorCount() {
        LinkedStack stack = new LinkedStack(1);
        assertEquals(1, stack.getCount());
    }

    @Test
    void popLowersCount() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.pop();
        assertEquals(1, stack.getCount());
    }

    @Test
    void pushRaisesCount() {
        LinkedStack stack = new LinkedStack();
        stack.push(0);
        stack.push(1);
        assertEquals(2, stack.getCount());
    }
}
