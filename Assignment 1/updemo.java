import java.io.*;
import java.util.*;
class second
{
	int a;
	void update(int n)
	{
		int a,b,c,i;
		a=0;
		b=1;
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(i=1;i<=(n-3);i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}
}
class updemo
{
	public static void main(String a[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an int:");
		x=sc.nextInt();
		second obj=new second();
		y=obj.update(x);
		System.out.println(y);
	}
}