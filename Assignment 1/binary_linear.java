import java.io.*;
import java.util.*;
class B
{
	int l[]={1,2,3,4,5};
	int c=0,i,item,flag=0,count=0;
	void linear(int item)
	{
		for(i=0;i<=4;i++)
		{
			c+=1;
			if (l[i]==item)
			{
				flag=1;
				break;
			}
		}
		if (flag==1)
		{
			System.out.println("Item found linear");
			
			System.out.println(c);

		}
		else
		{
			System.out.println("Item not found in linear");
			System.out.println("worst case:"+c);
		}

				
	}
	void binary(int item)
	{
		int beg=0;
		int end=4;
		int flam=0;
		int count=0;
		while(beg<=end)
		{
			int mid=(int)((beg+end)/2);
			count+=1;
			if(item==l[mid])
			{
				flam=1;
				break;
			}
			else if(item<l[mid])
				end=l[mid]-1;
			else 
				beg=l[mid]+1;
			

		}
		if (flam==1)
		{
			if (flam>0)
			
				System.out.println(count);
				System.out.println("item found in binary");
		}
		else
		{
			System.out.println("item not found");
			System.out.println("worst case:"+count);
		}
		
	}
}
class binary_linear
{
	public static void main(String a[])
	{
		
		int x;
		B obj=new B();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item:");
		x=sc.nextInt();

		obj.linear(x);
		obj.binary(x);
	}
}