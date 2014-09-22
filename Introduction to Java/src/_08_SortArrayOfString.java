import java.util.Arrays;
import java.util.Scanner;


public class _08_SortArrayOfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] allWords = new String[n];
		for (int i = 0; i < n; i++) {
			allWords[i] = scan.next();
		}
		
		Arrays.sort(allWords);
		
		for (int i = 0; i < allWords.length; i++) {
			System.out.println(allWords[i]);
		}
	}

}
