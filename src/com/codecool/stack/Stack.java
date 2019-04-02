package com.codecool.stack;

import java.lang.reflect.Array;

public class Stack<T> {

    public T[] innerArray;
    private int lastEmptyIndex = 0;

    public Stack(int maxSize) {
        innerArray = (T[])new Object[maxSize];
    }

    public void push(T object) {

        if (lastEmptyIndex < innerArray.length) {
            innerArray[lastEmptyIndex] = object;
            lastEmptyIndex++;
        } else {
            throw new StackUnderflow();
        }

    }

    public int getSize() {
        return lastEmptyIndex;

    }

    public T pop() {

        if (lastEmptyIndex > 0) {
            lastEmptyIndex--;
            return innerArray[lastEmptyIndex];
        } else { throw new StackOverflow(); }

    }

    public T peek() {

        if (lastEmptyIndex > 0) {
            return innerArray[lastEmptyIndex - 1];
        } else { throw new StackOverflow(); }

    }
}
