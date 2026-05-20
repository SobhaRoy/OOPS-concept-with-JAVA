import java.io.*;
import java.util.*;

class A
{
    String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};	

    void calculate(String n)
    {
        String[] new_arr = new String[100]; 
        char[] char_ar = n.toCharArray();
        int index = 0;
	if (char_ar.length == 1)
	{
		int p1 = char_ar[0] - '0';
		for (int i = 0; i < arr[p1 - 2].length(); i++) 
		{
			System.out.println(arr[p1-2].charAt(i));
		}
	}

        if (char_ar.length == 2) {
            int p1 = char_ar[0] - '0';
            int p2 = char_ar[1] - '0';

            for (int i = 0; i < arr[p1 - 2].length(); i++) {
                for (int j = 0; j < arr[p2 - 2].length(); j++)
                {
                    
                    String ele = "" + arr[p1 - 2].charAt(i) 
                                    + arr[p2 - 2].charAt(j);

                    new_arr[index] = ele;
                    index++;
                }
            }

            for (int i = 0; i < index; i++)
                System.out.println(new_arr[i]);
        }
    }
}

class Letter_combinations_of_phone_no
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String n = sc.nextLine();

        A obj = new A();
        obj.calculate(n);
    }
}