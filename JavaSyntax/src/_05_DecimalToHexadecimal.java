import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String hexa = Integer.toHexString(i).toUpperCase();
		System.out.println(hexa);

	}

}
