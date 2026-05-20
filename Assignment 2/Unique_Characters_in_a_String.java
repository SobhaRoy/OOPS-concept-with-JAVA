import java.util.*;

class A
{
	void calculate(String str)
	{
		int flag=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("All characters are not unique");
		else
			System.out.println("All characters are unique");

		
	}
	
}
class Unique_Characters_in_a_String
{
	 public static void main(String args[])
    	{
        	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a unique string:");
		String str=sc.nextLine();
		A obj=new A();
		obj.calculate(str);
	}

}