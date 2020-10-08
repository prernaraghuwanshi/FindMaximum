package com.bridgelabz.FindMaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxTest {
	MaxMain m = null;

	@Before
	public void initialize() {
		m = new MaxMain();
	}

	@Test
	public void givenThreeIntegers_whenMaxAtPosition1_ReturnPosition1Integer() {
		Integer max = m.findMaximum(10, 9, 3);
		assertEquals((Integer) 10, max);
	}
	@Test
	public void givenThreeIntegers_whenMaxAtPosition2_ReturnPosition2Integer() {
		Integer max = m.findMaximum(6, 9, 3);
		assertEquals((Integer) 9, max);
	}
	@Test
	public void givenThreeIntegers_whenMaxAtPosition3_ReturnPosition3Integer() {
		Integer max = m.findMaximum(1, 2, 3);
		assertEquals((Integer) 3, max);
	}
	@Test
	public void givenThreeFloats_whenMaxAtPosition1_ReturnPosition1Float() {
		Double max = m.findMaximum(10.2, 9.4, 3.7);
		assertEquals((Double) 10.2, max);
	}
	@Test
	public void givenThreeFloats_whenMaxAtPosition2_ReturnPosition2Float() {
		Double max = m.findMaximum(6.2, 9.3, 3.8);
		assertEquals((Double) 9.3, max);
	}
	@Test
	public void givenThreeFloats_whenMaxAtPosition3_ReturnPosition3Float() {
		Double max = m.findMaximum(1.1, 2.2, 3.3);
		assertEquals((Double) 3.3, max);
	}
}
