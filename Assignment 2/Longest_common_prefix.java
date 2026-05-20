class A
{
	String[] strs={"flower","flow","flight"};
	void calculate()
	{
		int loc=100,p;
		String loc1="";
		for(String i:strs)
		{
			p=i.length();
			if(p<loc)
			{
			   loc=p;
			   loc1=i;
			}
		}
		char[] str1=strs[0].toCharArray();
		char[] str2=strs[1].toCharArray();
		char[] str3=strs[2].toCharArray();
		String prefix="";
		for(int i=0;i<loc;i++)
		{
			if(str1[i]==str2[i] && str2[i]==str3[i])
				prefix=prefix+str1[i];
			else
				break;
		}
		if(prefix!="")
			System.out.println(prefix);
		else
			System.out.println("no match");

		
	}
}
class Longest_common_prefix
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.calculate();
	}
}