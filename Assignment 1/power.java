import java.io.*;
import java.util.*;
class third
{
	int i;
	double p;
	void calculate(int x, int y)
	{
		p=Math.pow(x,y);
		System.out.println(p);
	}
}
class power
{
	public static void main(String a[])
	{
		int x,y;
		third obj=new third();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base no:");
		x=sc.nextInt();
		System.out.println("Enter power no:");
		y=sc.nextInt();

		obj.calculate(x,y);

			}
}