import java.io.*;
public class Add
{
	static int add;
	Add(int a,int b)
	{
		int c=a+b;
		add=c;
	}
	public static void main(String args[])
	{
		Add obj=new Add(5,4);
		System.out.println("5+4="+add);
	}
}