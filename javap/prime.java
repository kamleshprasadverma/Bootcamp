//worng program
import java.util.*;
import java.io.*;

public class prime
{
	public static void main(String args[])
	{
		int n,m,i,j; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.");
		n =sc.nextInt();
		System.out.println("Enter the last no.");
		m =sc.nextInt();
		System.out.println("prime no from "+n+" to "+m+" is :");
		for(i  = n;i <= m;i++)
		{
			int c=0;
			for(j =1 ; j <= i; j++)
			{
				if( i % j == 0)
				{
					c++;
				}				
				if(c == 2)
				{
					System.out.println(i);
				}
			
			}	
		}
			
		
	}
}