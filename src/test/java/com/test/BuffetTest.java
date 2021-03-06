package com.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

public class BuffetTest {
	public int number;
	public Buffet buf;
	
	@Before
	public void before() {
		this.number=0;
		this.buf = new Buffet();
	}
	@Test
	public void getNumberFromSetNumberByNumber5() {
		this.number = 5;
		
		int expected = 5;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
	public void getNumberFromSetNumberByNumber2() {
		this.number = 2;
		
		int expected = 2;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
}
