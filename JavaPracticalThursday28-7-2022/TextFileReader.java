import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
public class TextFileReader {
	public static void main(String[]args)
	{
		Writer writer=null;
		BufferedWriter br=null;
		String data="My favorite place is Guhagar.Guhagar is famous for beaches,lake,waterfalls,temple and konkani cuisine.It is a tourist spot";
		try 
		{
			writer=new FileWriter("abc.txt");
			br=new BufferedWriter(writer);
			br.write(data);
			br.flush();
			System.out.println("Data written to file");	
			}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
