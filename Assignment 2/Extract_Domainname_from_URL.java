import java.util.*;

class A
{
	void calculate(String str)
	{
		str=str.toUpperCase();
		int index1=str.indexOf("//");
		int index2=str.indexOf("/",index1+2);
		if(str.contains("WWW."))
		{											str=str.replace("WWW.","");
			int index3=str.indexOf("/",index1+2);
			System.out.println(str.substring(index1+2,index3));
		}
			
		else
			System.out.println(str.substring(index1+2,index2));
		

		


			}
}
class Extract_Domainname_from_URL

 
{
	public static void main(String args[])
    	{
        	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Url:");
		String str=sc.nextLine();
		A obj=new A();
		obj.calculate(str);
	}

}