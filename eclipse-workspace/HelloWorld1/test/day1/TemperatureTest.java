package day1;

import static org.junit.Assert.*;

import org.junit.Test;

import day1.Temperature;


public class TemperatureTest {


	@Test
	public void test()
	{
		Temperature t = new Temperature();
		double actual = t.convertToFahrenheit(36);
		double expected = 96.8;
		double delta = 0.00;
		assertEquals( expected, actual,delta);
	}
	
	@Test
	public void test1() {
		Temperature t = new Temperature();
		double actual = t.convertToCelsius(96.8);
		double expected = 36;
		double delta = 0.00;
		assertEquals( expected, actual,delta);
	}

}
