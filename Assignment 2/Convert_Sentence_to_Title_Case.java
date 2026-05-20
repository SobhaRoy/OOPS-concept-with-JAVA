import java.util.*;

class A
{
	void calculate(String str)
	{
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			char p=Character.toUpperCase(words[i].charAt(0));
			String new1="";
			for(int j=1;j<words[i].length();j++)
			{
				new1+=words[i].charAt(j);
			}
			words[i]=p+new1;
		}
		System.out.println(String.join(" ",words));
		




	}
}




class Convert_Sentence_to_Title_Case
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