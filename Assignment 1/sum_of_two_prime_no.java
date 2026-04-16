import java.io.*;
import java.util.*;
class third
{
	void calculate(int n)
	{
		int s=2,i,j,c,loc;
		for(i=3;i<=100;i++)
		{
			c=0;
			for (j=1;j<=i;j++)
				if(i%j==0)
					c+=1;

				if(c==2)
				{
					loc=i;
					s=loc+i;
					System.out.println(s);
				}
		}
				
	}
}
class sum_of_two_prime_no
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		x=sc.nextInt();
		

		obj.calculate(x);

			}
}