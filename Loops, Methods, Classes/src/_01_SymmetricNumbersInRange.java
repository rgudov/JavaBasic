import java.util.Scanner;


public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}

	}

}
