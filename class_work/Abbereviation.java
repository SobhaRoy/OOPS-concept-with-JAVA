import java.util.*;

class A
{
	void calculate(String str)
	{
		String result="";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			char p=Character.toUpperCase(words[i].charAt(0));
			String new1="";
			{
				if(words[i].length()!=2 && words[i].length()!=1)
				{
					new1+=words[i].charAt(0);
					result+=p;
				}
			}
			
		}
		System.out.println(result);
		




	}
}




class Abbereviation
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