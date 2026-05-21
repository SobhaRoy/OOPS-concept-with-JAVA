import java.util.*;

class A
{
	void calculate(String str)
	{
		String result="";
		String result1="";
		String[] words=str.split(" ");
		for(int i=0;i<words.length-1;i++)
		{
			char p=Character.toUpperCase(words[i].charAt(0));
			result+=p;
			result+='.';
		}
		/*String last_str=words[words.length-1];
		for(int j=0;j<last_str.length();j++)
		{
			char 									q=Character.toUpperCase(words[words.length-1].charAt(j));
			result1+=q;
		}			

		System.out.println(result+result1);*/
		
		result+=words[words.length-1].toUpperCase();
		System.out.println(result);
		




	}
}




class Abbereviation_with_title
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