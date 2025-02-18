import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("Please enter a valid temperature in Celsius.");
            }
        } while (!done);


        fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
    }
}
