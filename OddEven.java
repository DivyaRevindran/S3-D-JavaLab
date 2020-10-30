import java.io.*;
import java.util.Scanner;
public class OddEven
{
	void Check(int n)
	{
		if(n%2==0)
		System.out.println("The entered number is Even");
		else
		System.out.println("The entered number is Odd");
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to be check:");
		int n=input.nextInt();
		OddEven obj=new OddEven();
		obj.Check(n);
	}
}
