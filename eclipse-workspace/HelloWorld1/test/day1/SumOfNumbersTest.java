package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test_sum_even() {
		SumOfNumbers s = new SumOfNumbers();
		int actual = s.sumOfEvenNumbers(1,10);
		int expected = 30;
		assertEquals(actual,expected);
	}

	@Test
	public void test_sum_odd() {
		SumOfNumbers s = new SumOfNumbers();
		int actual = s.sumOfOddNumbers(2,10);
		int expected = 24;
		assertEquals(actual,expected);
	}
}
