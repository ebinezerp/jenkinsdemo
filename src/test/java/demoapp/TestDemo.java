package demoapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,true);
	}
	
	@Test
	public void test2()
	{
		assertEquals(false, false);
	}
	
	@Test
	public void test3()
	{
		assertEquals(false, false);
	}

	@Test
	public void test5()
	{
		assertEquals(false, false);
	}
}
