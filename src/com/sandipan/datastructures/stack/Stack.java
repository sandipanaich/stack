package com.sandipan.datastructures.stack;

import java.util.Random;

public class Stack {

	public Stack(int size) {
		stack = new int[size];
	}

	public int pop() {
		if (length == 0) {
			throw new RuntimeException("Stack is empty.");
		}
		return stack[--length];
	}

	public void push(int value) {
		if (length == size()) {
			throw new RuntimeException("Stack is already full.");
		}
		stack[length++] = value;
	}

	public int length() {
		return length;
	}

	private int size() {
		return stack.length;
	}

	private int length = 0;
	private int[] stack;

}
