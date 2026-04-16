import java.io.*;
import java.util.*;
class third
{
	int c=0,i,j;
	void prime1(int n)
	{
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					c+=1;
			}
		if (c==2)
			System.out.println(i+"prime");
		}

	}
}
class prime
{
	public static void main(String a[])
	{
		int x;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		x=sc.nextInt();
		
		obj.prime1(x);
			}
}