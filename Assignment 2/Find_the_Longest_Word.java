import java.util.*;

class A
{
	void calculate(String str)
	{
		String[] words=str.split(" ");
		int max=0;
		String loc="";
		for(int i=0;i<words.length;i++)
		{
			int c=0;
			for(int j=0;j<words[i].length();j++)
			{
				c+=1;
			}
			if(max<c)
			{
				max=c;
				loc=words[i];
			}
		}
		System.out.println(loc);
	}
	
}
class Find_the_Longest_Word
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