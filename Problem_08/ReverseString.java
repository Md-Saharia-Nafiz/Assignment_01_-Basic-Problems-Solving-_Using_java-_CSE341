import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] words = str.split(" ");

        System.out.print("Reversed words: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        input.close();
    }
}