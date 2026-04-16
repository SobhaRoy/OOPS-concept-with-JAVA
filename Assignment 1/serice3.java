import java.io.*;
import java.util.*;
class third
{
	int i,j=1,k=2,c,p=1,m=1;
	void third1(int n)
	{
		for(i=1;i<n;i++)
		{
			if(i%2!=0)
			{
				j=m*2;
				System.out.println(j);
				m+=1;
			}
			else if (i%2==0)
			{
				if(i==2)
				{
					System.out.println(p);
					continue;	
				}				
				p=p*k;
				k+=1;						
				System.out.println(p);

			}
		}

	}
}
class serice3
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