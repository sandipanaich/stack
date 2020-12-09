package com.sandipan.datastructures;

import java.util.Random;

import com.sandipan.datastructures.stack.Stack;

public class StackMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>(10);
		Random random = new Random();

		try {
			for (int i = 0; i < 100; i++) {
				stack.push(random.nextInt(100));
				System.out.println("Number of elements in the stack :: " + stack.length());
			}
		} catch (RuntimeException e) {
			System.out.println("Done Pushing.");
		}

		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + " element in the stack " + stack.pop());
			}
		} catch (RuntimeException e) {
			System.out.println("Done Popping.");
		}

	}
}
