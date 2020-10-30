import java.io.*;
import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a three digit number:");
		int n=input.nextInt();
		int temp=n,rem,arm=0;
		while(n!=0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==temp)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
	}
}