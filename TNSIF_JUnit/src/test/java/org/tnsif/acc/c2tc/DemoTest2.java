package org.tnsif.acc.c2tc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTest2 {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Executing BeforeAll..");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each Test...");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After Each Test...");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("Executing After All..");
	}

	@Test
	void testAdd() {
		Calculator d2 = new Calculator();
		int actual = d2.add(5, 5);
		int expected = 10;
		assertEquals(actual, expected, "Addition Test Case");
	}

	@Test
	void testSub() {
		Calculator d2 = new Calculator();
		int actual = d2.sub(5, 5);
		int expected = 0;
		assertEquals(actual, expected, "Addition Test Case");
	}

	@Test
	void testMul() {
		Calculator d2 = new Calculator();
		int actual = d2.mul(5, 5);
		int expected = 25;
		assertEquals(actual, expected, "Addition Test Case");
	}

	@Test
	void testDiv() {
		Calculator d2 = new Calculator();
		int actual = d2.div(5, 5);
		int expected = 1;
		assertEquals(actual, expected, "Addition Test Case");
	}

}
