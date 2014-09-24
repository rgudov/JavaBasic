import java.util.Random;
import java.util.Scanner;


public class _06_RandomHandOfFiveCards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random rand = new Random();
		
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '♣', '♦', '♥', '♠' };
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int face = rand.nextInt(12);
				int suit = rand.nextInt(3);
				System.out.print(faces[face] + suits[suit] + " ");
			}
			System.out.println();
		}	
	}
}
