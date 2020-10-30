import java.io.*;
import java.util.Scanner;
public class CheckPrime
{
	static boolean flag=true;
	void check(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to be check:");
		int n=input.nextInt();
		CheckPrime obj=new CheckPrime();
		obj.check(n);
		if(n==1)
		{
			System.out.println("The number is neither prime nor composite");
		}
		else
		{
			if(flag==true)
			{
				System.out.println(n + " is a prime number");
			}
			else
			{
				System.out.println(n + " is not a prime number");
			}
		}
	}
}
					
