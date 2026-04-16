import java.io.*;
import java.util.*;
class third
{
	int i,j,f=1;
	double s=0;
	void series(int n)
	{
		for(i=1;i<=n;i++)
		{
			f=1;
			for(j=1;j<=i;j++)
			{
				f=f*j;
			}
			 s = s + (1.0 / f); 
		}
		
		System.out.println(s);		
	}
}
class series4
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fst no:");
		x=sc.nextInt();

		obj.series(x);
			}
}