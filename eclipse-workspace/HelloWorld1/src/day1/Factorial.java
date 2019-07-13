package day1;

public class Factorial{
	public static int calculateFactorial(int number)
	{
		int product = 1;
		for(int i=number;i>=1;i--)
			product*=i;
		return product;
	}
	public static void main(String[] args)
	{
		int number;
		int product = calculateFactorial(number);
	}
}