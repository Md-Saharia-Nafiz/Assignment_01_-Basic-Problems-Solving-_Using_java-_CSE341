import java.util.Scanner;

public class WhetheraSubstring {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter the substring: ");
        String sub = input.nextLine();

        if (str.contains(sub)) {
            System.out.println("Substring is present in the string.");
        } else {
            System.out.println("Substring is not present in the string.");
        }

        input.close();
    }

    
}
