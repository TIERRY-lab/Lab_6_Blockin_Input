import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("Please enter a valid width.");
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid height.");
                done = false;
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("The area of the rectangle is: %.2f", area);
        System.out.printf("The perimeter of the rectangle is:%.2f", perimeter);
    }
}
