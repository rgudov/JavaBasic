import java.util.Scanner;


public class _04_TheSmallerOfTreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a <= b && a<=c) {
			System.out.println(a);
		}
		else if(b<=a && b<=c){
			System.out.println(b);
		}
		else if(c<=a && c<=b){
			System.out.println(c);
		}
		

	}

}
