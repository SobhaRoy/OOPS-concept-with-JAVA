import java.io.*;
import java.util.*;
class third
{
	int i;
	char p;
	void calculate()
	{
		for(i=65;i<=90;i++)
		{
			p=(char)i;
			System.out.println(p);
		}
	}
}
class Alphabet_print
{
	public static void main(String a[])
	{
		
		third obj=new third();		
		obj.calculate();
			}
}