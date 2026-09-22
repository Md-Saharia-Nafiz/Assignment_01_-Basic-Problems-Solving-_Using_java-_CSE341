import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        input.close();
    }
}