import java.util.*;

class A
{
    String[] bad_words = {"bad","ugly","stupid"};

    void calculate(String str1)
    {
        String[] words = str1.split(" ");

        for(int i = 0; i < words.length; i++)
        {
            String star = "";

            for(int j = 0; j < bad_words.length; j++)
            {
                if(words[i].equals(bad_words[j]))
                {
                    for(int p = 0; p < words[i].length(); p++)
                        star += "*";

                    words[i] = star;  
                    break;
                }
            }
        }

        for(int i = 0; i < words.length; i++)
            System.out.println(words[i]);
    }
}

class Replace_profanity_in_text
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        A obj = new A();

        System.out.println("Enter the text:");
        String s1 = sc.nextLine();

        obj.calculate(s1);
    }
}