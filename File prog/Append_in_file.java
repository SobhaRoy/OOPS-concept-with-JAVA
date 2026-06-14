import java.io.*;
class Append_in_file{
	public static void main(String arg[])
	{
		try{FileWriter wr=new FileWriter("A.java",true);
		wr.write("append for bufferedwriter");
		wr.close();
		System.out.println("Append successful");
		}
		catch(Exception e)
		{System.out.println("Error");}
	
	}


}