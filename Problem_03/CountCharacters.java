import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int alphabets = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Total Alphabets = " + alphabets);
        System.out.println("Total Digits = " + digits);
        System.out.println("Total Special Characters = " + special);

        input.close();
    }
}