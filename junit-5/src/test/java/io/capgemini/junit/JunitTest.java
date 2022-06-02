package io.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {
	Junit junit;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}

	@AfterAll
	static void afterAllInit() {
		System.out.println("This needs to run after all");
	}

	@BeforeEach
	void init() {
		junit = new Junit();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up....");
	}

	@Test
	void testAdd() {
		int expected=2;
		int actual=junit.add(1, 1);
		assertEquals(expected,actual,"The add method should add two numbers");
	}

	@Test
	void testSubtract() {
		int expected=2;
		int actual=junit.subtract(3, 1);
		assertEquals(expected,actual,"The add method should add two numbers");
	}

}
