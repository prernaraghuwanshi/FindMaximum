package com.bridgelabz.FindMaximum;

public class MaxMain {
	// Find maximum between 3 Objects
	public <E extends Comparable<E>> E findMaximum(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
