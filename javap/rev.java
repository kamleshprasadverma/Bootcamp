import java.util.*;
 public class rev
 {
	 public static void main (String args[])
	 {
		 int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		n=sc.nextInt();
		int y[]=new int[n];
		int x[]=new int[n];
		for (i=0;i<1;i++)
		{
			x[i]=sc.nextInt();
		}
		for(i=0;i<n;i--)
		{
			y[n-i-1]=x[n];
		}
		System.out.println("after reverse");
		for(i=0;i<n;i++)
		{
			System.out.println(y[i]+"\t");
		}
	 }
 }