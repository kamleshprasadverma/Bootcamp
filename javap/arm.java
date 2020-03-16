import java.util.*;
import java.io.*;
public class arm
{
	public static void main(String args[])
	{
		int n,t,num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of maximum no.of 3 digit");
		num=sc.nextInt();
		n=num;
		
	 while(n!=0)
		{
			t=n%10;
			sum=sum+(t*t*t);
			n=n/10;
		}
		if(num==sum)
		{
			System.out.println("NO.is Armstrong");
		}
		else
		{ 
		System.out.println("not a armstrong ");
		}
		
	}
}
		