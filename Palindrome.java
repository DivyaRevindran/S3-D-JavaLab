import java.io.*;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to be check:");
		int n=input.nextInt();
		int temp=n;
		int rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
	}
}