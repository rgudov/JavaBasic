import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		try{
			  FileInputStream fstream = new FileInputStream("C://Users/rgudo_000/workspace/Loops, Methods, Classes/bin/file.txt");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String line;
			  int result = 0;
			  while ((line = br.readLine()) != null)   {
				  result+=Integer.parseInt(line);
			  }
			  System.out.println(result);
			  in.close();
			    }catch (Exception e){
				  System.err.println("Error");
				  }
				  }
}
