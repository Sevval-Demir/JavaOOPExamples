import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("kod.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		String val="Kodlama vakti!";
		FileWriter fwriter=new FileWriter(file,false);
		BufferedWriter bwriter=new BufferedWriter(fwriter);
		
		bwriter.write(val);
		bwriter.write("\nJava Dersleri");
		bwriter.close();
		
		FileReader filereader=new FileReader(file);
		String line;
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		while((line=bufferedreader.readLine())!=null)
		{
			System.out.println(line);
		}
		bufferedreader.close();

	}

}
