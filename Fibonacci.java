import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n=obj.nextInt();
		int F=0;
		int S=1;
		int T=F+S;
		System.out.print(F+" "+S);
		while(T<=n)
		{
			System.out.print(" "+T);
			F=S;
			S=T;
			T=F+S;	
		}
	}
}
	