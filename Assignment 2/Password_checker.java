import java.io.*;
import java.util.*;
class A
{
	void calculate(char char_ar[],int n)
	{
		int c=0,d=0,flag=0,capi=0;
		for(int i=0;i<char_ar.length;i++)
		{
			c+=1;
			if(Character.isDigit(char_ar[i]))
				d+=1;
			if(Character.isUpperCase(char_ar[i]))
				capi+=1;
			if(char_ar[i]==' ' || char_ar[i]=='/')
				flag=1;
		
		}
		if(Character.isDigit(char_ar[0]))
			flag=1;
		if(c>=4 && d>=1 && capi>=1 && flag==0)
			System.out.println("1");
		else
			System.out.println("0");

		
				
	}
}
class Password_checker
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String str1=sc.nextLine();
		char[] char_ar=str1.toCharArray();
		int n=str1.length();
		A obj=new A();
		obj.calculate(char_ar,n);
	}
}