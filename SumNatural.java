import java.io.*;
import java.util.Scanner;
public class SumNatural
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of first "+n +" numbers is "+ sum);
	}
}