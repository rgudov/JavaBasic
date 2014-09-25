import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner words = new Scanner(System.in);
		String stringWordCount = words.nextLine();
		String[] countingWord =  stringWordCount.split(" ");
		int totalNumberOfWordString = countingWord.length;
		System.out.println(totalNumberOfWordString);
		   }

	}


