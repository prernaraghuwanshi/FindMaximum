package com.bridgelabz.FindMaximum;

import java.util.Arrays;

public class MaxMain<E extends Comparable<E>> {
	E firstGenericObject;
	E secondGenericObject;
	E thirdGenericObject;

	public MaxMain(E firstGenericObject, E secondGenericObject, E thirdGenericObject) {
		this.firstGenericObject = firstGenericObject;
		this.secondGenericObject = secondGenericObject;
		this.thirdGenericObject = thirdGenericObject;
	}

	// Find maximum for 3 elements or more
	public static <E extends Comparable<E>> E findMaximum(E firstGeneric, E secondGeneric, E thirdGeneric,
			E... genericArray) {
		E maxGeneric = firstGeneric;
		if (secondGeneric.compareTo(maxGeneric) > 0) {
			maxGeneric = secondGeneric;
		}
		if (thirdGeneric.compareTo(maxGeneric) > 0) {
			maxGeneric = thirdGeneric;
		}
		if (genericArray.length > 0)
			maxGeneric = findMaxGenericArray(maxGeneric, genericArray);
		printMax(firstGeneric, secondGeneric, thirdGeneric, maxGeneric, genericArray);
		return maxGeneric;
	}

	// Find maximum for more than 3 elements
	private static <E extends Comparable<E>> E findMaxGenericArray(E maxGeneric, E[] genericArray) {
		for (E genericElement : genericArray) {
			if (genericElement.compareTo(maxGeneric) > 0)
				maxGeneric = genericElement;
		}
		return maxGeneric;
	}

	public E findMaximum() {
		return MaxMain.findMaximum(firstGenericObject, secondGenericObject, thirdGenericObject);
	}

	// Print function
	public static <E> void printMax(E firstGeneric, E secondGeneric, E thirdGeneric, E maxGeneric,
			E... genericArray) {
		System.out.println("Given Array:- ");
		System.out.println(firstGeneric + "\n" + secondGeneric + "\n" + thirdGeneric);
		if (genericArray.length > 0) {
			for (E iterator : genericArray)
				System.out.print(iterator + "\n");
		}
		System.out.println("\nMaximum element is:- " + maxGeneric);
	}

}
