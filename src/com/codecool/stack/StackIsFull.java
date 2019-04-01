package com.codecool.stack;

public class StackIsFull extends RuntimeException {

    public StackIsFull() {
        super("Stack is full!");
    }
}
