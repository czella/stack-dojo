package com.codecool.stack;

public class StackUnderflow extends RuntimeException {

    public StackUnderflow() {
        super("Stack is full!");
    }
}
