import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class _05_PrintCurrentDateTime {
  public static void main(String[] args) {
	  
 	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
	   
   }
}
 
