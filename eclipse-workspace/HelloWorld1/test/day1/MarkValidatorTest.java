package day1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarkValidatorTest {

	@Test
	public void test_isPass() {
		MarkValidator m = new MarkValidator();
		boolean actual = m.isPass(40);
		boolean expected = true;
		assertEquals(actual,expected);
	}
	
	@Test
	public  void test_markGrade()
	{
		MarkValidator m = new MarkValidator();
		char actual = m.markGrade(91);
		char expected = 'A';
		assertEquals(actual,expected);
	}

}
