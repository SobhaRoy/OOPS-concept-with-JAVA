import java.io.*;
import java.util.*;
interface Speaker
{
	void Speak(String text);
}
interface Translator
{
	void translate(String text,String language);
}
class AIAssistant implements Speaker, Translator
{
	public void Speak(String text)
	{
		System.out.println("AI Assistant Speaking: "+text);
	}
	public void translate(String text,String language)
	{
		if(language.equalsIgnoreCase("bengali"))
			System.out.println("Translated Text: "+"sagotom");
		else if(language.equalsIgnoreCase("hindi"))
			System.out.println("Translated Text: "+"Suagat");
		else if(language.equalsIgnoreCase("french"))
			System.out.println("Translated Text: "+"Bonjour");
		else System.out.println("language not mentioned");
		
	}
}
class AI_Powered_Assistant
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter text:");
	String text=sc.nextLine();
	System.out.print("Enter language:");
	String language=sc.nextLine();
	System.out.println();

        AIAssistant obj=new AIAssistant();
	obj.Speak(text);
	obj.translate(text,language);
    }
}
