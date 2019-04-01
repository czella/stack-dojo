package com.codecool.stack;

public class Stack {

    private int maxSize;
    public Integer[] innerArray;
    private int lastEmptyIndex = 0;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        innerArray = new Integer[maxSize];
    }

    public void push(int i) {

        if (lastEmptyIndex < innerArray.length) {
            innerArray[lastEmptyIndex] = i;
            lastEmptyIndex++;
        } else {
            throw new StackIsFull();
        }

    }

    public int getSize() {
        return lastEmptyIndex;

    }

    public int pop() {

        if (lastEmptyIndex > 0) {
            lastEmptyIndex--;
            return innerArray[lastEmptyIndex];
        } else { throw new StackIsEmpty(); }

    }

    public int peek() {

        if (lastEmptyIndex > 0) {
            return innerArray[lastEmptyIndex - 1];
        } else { throw new StackIsEmpty(); }

    }
}
