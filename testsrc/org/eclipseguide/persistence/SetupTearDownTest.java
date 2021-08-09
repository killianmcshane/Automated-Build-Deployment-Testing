package org.eclipseguide.persistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SetupTearDownTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up fixtures");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tearing down fixtures");
	}

	@Test
	public void test() {
		System.out.println("Running test!");
	}

}
