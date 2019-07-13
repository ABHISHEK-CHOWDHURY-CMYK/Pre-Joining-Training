package day1;

public class SumOfNumbers{
	public static int sumOfEvenNumbers(int start, int end)
	{
		int sum = 0,i;
		for(i=start;i<=end;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		return sum;
	}
	
	public static int sumOfOddNumbers(int start,int end)
	{
		int sum = 0,i;
		for(i=start;i<=end;i++)
		{
			if(i%2==1)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int start,end;
		int sum_even = sumOfEvenNumbers(start,end);
		int sum_odd = sumOfOddNumbers(start,end);
	}
}