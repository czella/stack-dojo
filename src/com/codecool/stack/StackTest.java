package com.codecool.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StackTest {

    @Test
    public void pushElementIncreasesSize() {

        Stack stack = new Stack(5);
        int originalSize = stack.getSize();
        stack.push(10);
        int newSize = stack.getSize();
        assertEquals(originalSize + 1, newSize);

    }

    @Test
    public void pushThrowsExceptionWhenFull() {

        Stack stack = new Stack(1);
        stack.push(10);
        assertThrows(StackIsFull.class, () -> stack.push(11));

    }

    @Test
    public void popReturnsAndRemovesLastElement() {

        Stack stack = new Stack(2);
        int itemToPop = 5;
        stack.push(5);
        int originalSize = stack.getSize();
        int itemPopped = stack.pop();
        assertEquals(itemToPop, itemPopped);
        assertEquals(originalSize - 1, stack.getSize());

    }

    @Test
    public void popThrowsExceptionIfStackIsEmpty() {

        Stack stack = new Stack(2);
        assertThrows(StackIsEmpty.class, () -> stack.pop());

    }

    @Test
    public void peekReturnsLastElement() {

        Stack stack = new Stack(2);
        int itemToPeek = 6;
        stack.push(6);
        int originalSize = stack.getSize();
        int itemPeeked = stack.peek();
        assertEquals(itemToPeek, itemPeeked);
        assertEquals(originalSize, stack.getSize());

    }

    @Test
    public void peekThrowsExceptionIfStackIsEmpty() {

        Stack stack = new Stack(2);
        assertThrows(StackIsEmpty.class, () -> stack.peek());

    }



}
