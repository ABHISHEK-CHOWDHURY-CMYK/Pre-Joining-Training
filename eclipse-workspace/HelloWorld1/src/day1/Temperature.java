package day1;
import java.util.Scanner;

public class Temperature
{
	static double convertToFahrenheit(double celsius)
	{
		double fahrenheit = ((9*celsius)/5)+32;
		return fahrenheit;
	}
	static double convertToCelsius(double fahrenheit)
	{
		double celsius = ((fahrenheit-32)/9)*5;
		return celsius;
	}
	
	public static void main(String[] args)
	{
		double celsius,fahrenheit;
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter Fahrenheit temperature : ");
		//fahrenheit = input.nextDouble();
		double resultc = convertToCelsius(fahrenheit);
		//System.out.println("Enter Celsius temperature : ");
		//celsius = input.nextDouble();
		double resultf = convertToFahrenheit(celsius);
		//System.out.println("The result is:"+result);
		//input.close();
	}
}