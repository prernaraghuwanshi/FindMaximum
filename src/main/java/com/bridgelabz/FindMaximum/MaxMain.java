package com.bridgelabz.FindMaximum;

import java.util.Arrays;

public class MaxMain<E extends Comparable<E>> {
	E xobj;
	E yobj;
	E zobj;

	// Parameterized constructor
	public MaxMain(E xobj, E yobj, E zobj) {
		super();
		this.xobj = xobj;
		this.yobj = yobj;
		this.zobj = zobj;
	}

	// Find maximum between 3 Objects
	public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	public E findMaximum() {
		return MaxMain.findMaximum(xobj, yobj, zobj);
	}

	// Print function for 3 elements
	public static <E> void printMax(E a, E b, E c, E max) {
		System.out.println("Max of " + a + ", " + b + ", " + c + " is " + max);
	}

	// Find maximum for more than 3 Objects using Options and Sorting
	@SafeVarargs
	public static <E extends Comparable<E>> E findMaximum(E... arr) {
		Arrays.sort(arr);
		E max = arr[arr.length - 1];
		printMax(max, arr);
		return max;
	}

	// Print function for more than 3 objects
	@SafeVarargs
	public static <E> void printMax(E max, E... arr) {
		System.out.println("Array is ");
		for (E iterator : arr)
			System.out.print(" " + iterator + " ");
		System.out.println("\nMaximum is " + max);
	}

}
