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
		
		 if(mark>90)
			return 'A';
		else if(mark>75)
			return 'B';
		else if(mark>60)
			return 'C';
		else
			return 'D';
	}
	
	public static void main(String[] args)
	{
		int mark;
		isPass(mark);
		markGrade(mark);
	}
	
}