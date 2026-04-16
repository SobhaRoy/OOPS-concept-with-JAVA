import java.io.*;
import java.util.*;
class third
{
	int a,b,c,i,sum=0;
	void fibo(int n)
	{
		a=-1;
		b=1; 
		
		for(i=0;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			sum=sum+c;
			
		}
		System.out.println("The sum of the series:"+sum);

	}
}
class fibonacci_serice
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		x=sc.nextInt();
		
		obj.fibo(x);
			}
}