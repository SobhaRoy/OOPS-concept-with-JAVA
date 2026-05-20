import java.io.*;
import java.util.*;

class A
{
	void calculate(String str1, String str2)
	{
		int flag=0;
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				int c=0,co=0;
				char ch=str1.charAt(i);
				for(int j=0;j<str1.length();j++)
				{
					if(ch==str1.charAt(j))
						c+=1;
				}
				for(int p=0;p<str2.length();p++)
				{
					if(ch==str2.charAt(p))
						co++;
				}
				if(c!=co)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Anagram");
			else
				System.out.println(" not Anagram");
		}
		else
			System.out.println(" not Anagram");
	}	
    
}

class Anagram_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st string:");
	String str1=sc.nextLine();
	System.out.println("Enter 2nd string:");
	String str2=sc.nextLine();
        A obj = new A();
        obj.calculate(str1,str2);
    }
}