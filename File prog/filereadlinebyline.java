import java.io.*;
class filereadlinebyline{
	public static void main(String arg[])
	{
		try{FileReader fr=new FileReader("E_commerce_order_processing.java");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		fr.close();
		}catch(Exception e){
			System.out.println("Error reading file");}
	}
}