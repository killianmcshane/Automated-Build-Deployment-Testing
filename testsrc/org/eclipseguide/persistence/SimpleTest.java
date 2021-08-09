package org.eclipseguide.persistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals("Test Add",2+6,8);
	}
	
	@Test
	public void testMultiply() {
		assertEquals("Test Multiply",2*6,12);
	}


}
