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

	public MaxMain() {
		super();
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
		return max;
	}

	// Find maximum for more than 3 Objects using Options and Sorting
	public static <E extends Comparable<E>> E findMaximum(E... arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public E findMaximum() {
		return MaxMain.findMaximum(xobj, yobj, zobj);
	}
}
