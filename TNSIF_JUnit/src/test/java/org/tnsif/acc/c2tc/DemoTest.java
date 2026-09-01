package org.tnsif.acc.c2tc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testAdd() {
		Demo d1 = new Demo();
		int actual = d1.add(5, 5);
		int expected = 104;

//		if (expected == actual)
//			System.out.println("Passed.");
//		else
//			System.out.println("Failed.");

		assertEquals(expected, actual, "Addition Test Case.");

	}
}