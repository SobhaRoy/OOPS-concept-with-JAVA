import java.io.*;
import java.util.*;
class third
{
	int i,j=-1,a=-1,b=1,c;
	void third1(int n)
	{
		for(i=1;i<n;i++)
		{
			if(i==2)
			{
				System.out.println(j);
				continue;
			}
			if(i%2==0)
			{
				j=j-3;
				System.out.println(j);
			}
			else if (i%2!=0)
			{
								
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
						
				

			}
		}

	}
}
class serice2
{
	public static void main(String a[])
	{
		int x;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		x=sc.nextInt();
		
		obj.third1(x);
			}
}