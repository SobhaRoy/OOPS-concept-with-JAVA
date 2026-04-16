import java.io.*;
import java.util.*;
class third
{
	int a,b,c,i,co=0,j,flag=0;
	void prime_fibo1()
	{
		a=-1;
		b=1; 
		j=1;
		
		for(i=1;i<=50000;i++)
		{
			co=0;
			c=a+b;
			for(i=1;i<=c;i++)
			{
				if (c%i==0)
					co+=1;
			}
			
			if (co==2){
				flag+=1;
				System.out.println(c+ " "+flag);
				}
			if(flag==8)
				break;
			a=b;
			b=c;
					
		}
		
	}
}
class prime_fibo
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();		
		obj.prime_fibo1();
	}
}