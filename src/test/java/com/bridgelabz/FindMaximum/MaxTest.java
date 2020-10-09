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
		Float max = MaxMain.findMaximum(10.2f, 9.4f, 3.7f);
		assertEquals((Float) 10.2f, max);
	}

	@Test
	public void givenThreeFloats_whenMaxAtPosition2_ReturnPosition2Float() {
		Float max = MaxMain.findMaximum(6.2f, 9.3f, 3.8f);
		assertEquals((Float) 9.3f, max);
	}

	@Test
	public void givenThreeFloats_whenMaxAtPosition3_ReturnPosition3Float() {
		Float max = MaxMain.findMaximum(1.1f, 2.2f, 3.3f);
		assertEquals((Float) 3.3f, max);
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
		Float max = new MaxMain<Float>(4.4f, 3.3f, 2.2f).findMaximum();
		assertEquals((Float) 4.4f, max);
	}

	@Test
	public void givenGenericClassString_ReturnMaxString() {
		String max = new MaxMain<String>("Apple", "Banana", "Peach").findMaximum();
		assertEquals("Peach", max);
	}

	@Test
	public void givenMoreThan3Elements_ReturnMaxInteger() {
		Integer max = MaxMain.findMaximum(4, 3, 2, 6, 90, 34, 23);
		assertEquals((Integer) 90, max);
	}

	@Test
	public void givenMoreThan3Elements_ReturnMaxFloat() {
		Float max = MaxMain.findMaximum(4.9f, 3.8f, 2.6f, 6.4f, 90.0f, 34.9f, 2.3f);
		assertEquals((Float) 90.0f, max);
	}

	@Test
	public void givenMoreThan3Elements_ReturnMaxString() {
		String max = MaxMain.findMaximum("Apple", "Orange", "Peach", "Mango", "Strawberry");
		assertEquals("Strawberry", max);
	}
}
