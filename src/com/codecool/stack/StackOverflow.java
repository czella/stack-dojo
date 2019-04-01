package com.codecool.stack;

public class StackOverflow extends RuntimeException {

    public StackOverflow() {
        super("The stack is empty!");
    }
}
