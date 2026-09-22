import java.util.Scanner;

public class AreaandPerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle = " + area);
        System.out.println("Perimeter of the circle = " + perimeter);

        input.close();
    }
}