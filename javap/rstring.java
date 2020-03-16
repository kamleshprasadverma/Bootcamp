import java.util.*;
public class rstring
{
	public static void main (String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		str=sc.nextLine();
		char[] b= new char[str.length()];
		b=str.toCharArray();
		int a=0;
		int length=b.length;
		for(int i=a;i<length;i++)
		{
			if(Character.isWhitespace(b[i]))
			{
				i--;
				for(int j=i;j>=a;j--)
				{
					System.out.print(b[j]);
					if(j==0)
					System.out.print(" ");
				}
				i++;
				a=i;
			}
			if(length-1==i)
			{
				for(int j=i;j>=a;j--)
				{
					System.out.print(b[j]);
				}
			}
		}
		System.out.println();
	}
}	