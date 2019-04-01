package com.codecool.stack;

public class Stack {

    public Integer[] innerArray;
    private int lastEmptyIndex = 0;

    public Stack(int maxSize) {
        innerArray = new Integer[maxSize];
    }

    public void push(int i) {

        if (lastEmptyIndex < innerArray.length) {
            innerArray[lastEmptyIndex] = i;
            lastEmptyIndex++;
        } else {
            throw new StackUnderflow();
        }

    }

    public int getSize() {
        return lastEmptyIndex;

    }

    public int pop() {

        if (lastEmptyIndex > 0) {
            lastEmptyIndex--;
            return innerArray[lastEmptyIndex];
        } else { throw new StackOverflow(); }

    }

    public int peek() {

        if (lastEmptyIndex > 0) {
            return innerArray[lastEmptyIndex - 1];
        } else { throw new StackOverflow(); }

    }
}
