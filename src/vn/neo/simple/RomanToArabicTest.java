package vn.neo.simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	
	@Test
	public void testForConvert_I_to_1() {
		assertEquals(1, new Roman("I").getArabic());
	}
	
	@Test
	public void testForConvert_II_to_2() {
		assertEquals(2, new Roman("II").getArabic());
	}
	
	@Test
	public void testForConvert_X_to_10() {
		assertEquals(10, new Roman("X").getArabic());
	}

}
