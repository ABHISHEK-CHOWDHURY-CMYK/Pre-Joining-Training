package day1;

public class MarkValidator{
	
	 public static boolean isPass(int mark)
	{
		if(mark >= 40)
		{
			System.out.println("Pass");
			return true;
		}
		else
			return false;
	}
	
	  public static char markGrade(int mark)
	{
		  float markDividedByTen = mark/10;
		  
		  switch(int round(markDividedByTen+0.5))
		{
			case 10 : if(markDividedByTen==9) // for 90
								{
									return 'B';
									break;
								}
								else
									return 'A';   // cases like 91,92,93...
									break;
			case 9:     // cases like 76,77,...89,90
								if(markDividedByTen == 7.5)
								{
									return 'C';
									break;
								}
								else	
									return 'B';
									break;
			case 8:     //  cases like 61,62,...75
									if(markDividedByTen==6)
									{
										return 'D';
										break;
									}
									else
									return 'B'; 
									break;
			case 7:    // cases like infinity .. 60
								return 'D';
								break;
		}
	}
	
	public static void main(String[] args)
	{
		int mark;
		isPass(mark);
		markGrade(mark);
	}
	
}