package com.bridgelabz.FindMaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxTest {

	@Test
	public void givenThreeIntegers_whenMaxAtPosition1_ReturnPosition1Integer() {
		Integer max = MaxMain.findMaximum(10, 9, 3);
		assertEquals((Integer) 10, max);
	}

	@Test
	public void givenThreeIntegers_whenMaxAtPosition2_ReturnPosition2Integer() {
		Integer max = MaxMain.findMaximum(6, 9, 3);
		assertEquals((Integer) 9, max);
	}

	@Test
	public void givenThreeIntegers_whenMaxAtPosition3_ReturnPosition3Integer() {
		Integer max = MaxMain.findMaximum(1, 2, 3);
		assertEquals((Integer) 3, max);
	}

	@Test
	public void givenThreeFloats_whenMaxAtPosition1_ReturnPosition1Float() {
		Double max = MaxMain.findMaximum(10.2, 9.4, 3.7);
		assertEquals((Double) 10.2, max);
	}

	@Test
	public void givenThreeFloats_whenMaxAtPosition2_ReturnPosition2Float() {
		Double max = MaxMain.findMaximum(6.2, 9.3, 3.8);
		assertEquals((Double) 9.3, max);
	}

	@Test
	public void givenThreeFloats_whenMaxAtPosition3_ReturnPosition3Float() {
		Double max = MaxMain.findMaximum(1.1, 2.2, 3.3);
		assertEquals((Double) 3.3, max);
	}

	@Test
	public void givenThreeStrings_whenMaxAtPosition1_ReturnPosition1String() {
		String max = MaxMain.findMaximum("Peach", "Apple", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void givenThreeStrings_whenMaxAtPosition2_ReturnPosition2String() {
		String max = MaxMain.findMaximum("Apple", "Peach", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void givenThreeStrings_whenMaxAtPosition3_ReturnPosition3String() {
		String max = MaxMain.findMaximum("Apple", "Banana", "Peach");
		assertEquals("Peach", max);
	}

	@Test
	public void givenGenericClassInteger_ReturnMaxInteger() {
		Integer max = new MaxMain<Integer>(4, 3, 2).findMaximum();
		assertEquals((Integer) 4, max);
	}

	@Test
	public void givenGenericClassFloat_ReturnMaxFloat() {
		Double max = new MaxMain<Double>(4.4, 3.3, 2.2).findMaximum();
		assertEquals((Double) 4.4, max);
	}

	@Test
	public void givenGenericClassString_ReturnMaxString() {
		String max = new MaxMain<String>("Apple", "Banana", "Peach").findMaximum();
		assertEquals("Peach", max);
	}
}
