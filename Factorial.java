import java.io.*;
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number of numbers:");
		int n=obj.nextInt();
		if(n==0)
		{
			System.out.print("Invalid entry");
		}
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println(i+"!="+fact);
			fact=1;
		}
	}
}
	