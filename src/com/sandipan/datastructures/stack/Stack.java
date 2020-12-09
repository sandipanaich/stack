package com.sandipan.datastructures.stack;

public class Stack<E> {

	public Stack(int size) {
		stack = new Object[size];
	}

	public E pop() {
		E value = peek();
		length--;
		return value;
	}

	public void push(E value) {
		if (length == size()) {
			throw new RuntimeException("Stack is already full.");
		}
		stack[length++] = value;
	}
	
	public E peek()
	{
		if (length == 0) {
			throw new RuntimeException("Stack is empty.");
		}
		return (E)stack[length-1];
	}

	public int length() {
		return length;
	}

	private int size() {
		return stack.length;
	}

	private int length = 0;
	private Object[] stack;

}
