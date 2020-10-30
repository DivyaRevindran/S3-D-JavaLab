import java.io.*;
import java.util.Scanner;
public class Factor
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number to find the factors:");
		int n=obj.nextInt();
		System.out.println("The factors are:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			
			}
		}
	}
}