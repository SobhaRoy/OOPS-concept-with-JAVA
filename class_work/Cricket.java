import java.io.*;
import java.util.*;
class Cricket
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String name[];
		name=new String[10];
		for(int i=0;i<2;i++)
		{
			String a=sc.next();
			name[i]=a;
		}
		System.out.println("The values of array are:");
		for(int i=0;i<2;i++)
		{
			System.out.print(name[i]+" ");
			System.out.println();
		}


		int score[];
		score=new int[2];
		for(int i=0;i<2;i++)
			score[i]=sc.nextInt();
		System.out.println("The values of array are:");
		for(int i=0;i<2;i++)
		{
			System.out.print(score[i]+" ");
			System.out.println();
		}


		int original_score[];
		original_score=new int[2];
		for(int i=0;i<2;i++)
		{
			original_score[i]=score[i];
		}
		
			
			
		
		int max=score[0];
		for(int i=0;i<score.length;i++)
		{
			if(score[i]>max)
				max=score[i];
		}
		System.out.println(max);
		
		int s=0;
		for(int i=0;i<score.length;i++)
			s=s+score[i];
		System.out.println("Average run:");
		System.out.println(s/score.length);

		int c;
		for(int i=0;i<score.length-1;i++)
		{
			for(int j=0;j<(score.length-1)-i;j++)
			{
				c=score[j];
				score[j]=score[j+1];
				score[j+1]=c;
			}
		} 
		System.out.println("sorting are:");
		for(int i=0;i<score.length;i++)
			System.out.println(score[i]);

		System.out.println("Enter the player name:");
		String player=sc.next();
		
		int loc=0;
		int flag=0;
		for(int i=0;i<name.length;i++)
		{

			if(name[i].equals(player))
			{
				flag=1;
				loc=i;
				break;
			}
		}
		if(flag==1)
			System.out.println("player found and score is "+original_score[loc]);

		else
			System.out.println("not found");

						
			
		

		

		
		
	}
}