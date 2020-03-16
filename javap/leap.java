import java.util.*;
import java.io.*;
public class leap
{
public static void main(String[] args)
	{
		int y;
		boolean leap=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to verify leap year");
		y=sc.nextInt();
			
				if (y%4==0)
				
				System.out.println( y + " is  a leap year");
				else 
				
				System.out.println(y + " not leap year ");
			
	}
}	