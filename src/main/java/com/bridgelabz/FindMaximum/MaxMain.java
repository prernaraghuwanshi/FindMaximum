package com.bridgelabz.FindMaximum;

public class MaxMain {
	// Find maximum between 3 integers
	public Integer findMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
