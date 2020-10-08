package com.bridgelabz.FindMaximum;

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

	public E findMaximum() {
		return MaxMain.findMaximum(xobj, yobj, zobj);
	}
}
