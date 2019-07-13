package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		Factorial f = new Factorial();
		int actual = f.calculateFactorial(6);
		int expected = 720;
		assertEquals(actual,expected);
	}

}
