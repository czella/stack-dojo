package com.codecool.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StackTest {

    @Test
    public void pushElementIncreasesSize() {

        Stack stack = new Stack<Integer>(5);
        int originalSize = stack.getSize();
        stack.push(10);
        int newSize = stack.getSize();
        assertEquals(originalSize + 1, newSize);

    }

    @Test
    public void pushThrowsExceptionWhenFull() {

        Stack stack = new Stack<Integer>(1);
        stack.push(10);
        assertThrows(StackUnderflow.class, () -> stack.push(11));

    }

    @Test
    public void popReturnsAndRemovesLastElement() {

        Stack stack = new Stack<Integer>(2);
        Integer itemToPop = 5;
        stack.push(5);
        int originalSize = stack.getSize();
        assertEquals(itemToPop, stack.pop());
        assertEquals(originalSize - 1, stack.getSize());

    }

    @Test
    public void popThrowsExceptionIfStackIsEmpty() {

        Stack stack = new Stack<Integer>(2);
        assertThrows(StackOverflow.class, () -> stack.pop());

    }

    @Test
    public void peekReturnsLastElement() {

        Stack stack = new Stack<Integer>(2);
        Integer itemToPeek = 6;
        stack.push(6);
        int originalSize = stack.getSize();
        assertEquals(itemToPeek, stack.peek());
        assertEquals(originalSize, stack.getSize());

    }

    @Test
    public void peekThrowsExceptionIfStackIsEmpty() {

        Stack stack = new Stack<Integer>(2);
        assertThrows(StackOverflow.class, () -> stack.peek());

    }

    @Test
    public void stackWorksForString() {

        Stack stack = new Stack<String>(5);
        int originalSize = stack.getSize();
        stack.push("hello");
        int newSize = stack.getSize();
        assertEquals(originalSize + 1, newSize);
        assertEquals("hello", stack.pop());

    }



}
