import java.util.*;

class A
{
	void calculate(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				result=result+Character.toLowerCase(ch);
			else
				result+=Character.toUpperCase(ch);
						
		}
		System.out.println(result);

	}
}
class Toggle_the_case
{
	public static void main(String args[])
    	{
        	Scanner sc = new Scanner(System.in);
		System.out.print("Enter sentence:");
		String str=sc.nextLine();
		A obj=new A();
		obj.calculate(str);
	}

}