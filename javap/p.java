import java.util.Scanner;

public class p
{
	public static void main(String args[])
	{
		
		int n, m,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : "); 
		n  = s.nextInt();
		System.out.print("Enter the second number  :"); 
		m  = s.nextInt();
		
		for(i = n; i <= m ; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}