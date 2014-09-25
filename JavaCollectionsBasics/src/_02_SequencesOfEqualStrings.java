import java.util.Scanner;


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
        String input = str.nextLine();
        String[] words = input.split(" ");
        if (words.length == 1) {
                System.out.println(words[0]);
        }
        for (int i = 0; i < words.length - 1; i++) {
                if (words[i].equals(words[i + 1])) {
                        System.out.print(words[i] + " ");

                } else {
                        System.out.println(words[i]);
                }
        }
        if (words.length != 1) {
                System.out.print(words[words.length - 1]);
        }

	}

}
