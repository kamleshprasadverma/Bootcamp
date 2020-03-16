import java.util.*;
import java.io.*;
public class Revee
{
   public void reverse(String str)
   {
	
	String[] words = str.split(" ");
	String revString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String revWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		revWord = revWord + word.charAt(j);
	   }
	   revString = revString + revWord + " ";
	}
	//System.out.println(str);
	System.out.println(revString);
   }
   public static void main(String[] args) 
   {
	Revee obj = new Revee();
	String word;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	word=sc.nextLine();
	obj.reverse(word);
   }
}