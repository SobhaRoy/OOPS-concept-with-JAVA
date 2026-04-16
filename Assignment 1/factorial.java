import java.io.*;
import java.util.*;
class third
{
	int i,f=1;
	void fact(int n)
	{
		for(i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial is:"+" "+f);		
	}
}
class factorial
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		x=sc.nextInt();
		
		obj.fact(x);
			}
}