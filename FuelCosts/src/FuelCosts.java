import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("Please enter a valid number of gallons.");
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("Please enter a valid fuel efficiency.");
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid price per gallon.");
                done = false;
            }
        } while (!done);

        double costPer100Miles = 100 / fuelEfficiency * pricePerGallon;

        double distanceWithFullTank = gallons * fuelEfficiency;

        System.out.print("The cost to drive 100 miles is:");
        System.out.print("The car can go 100 miles with a full tank of gas.distanceWithFullTank");
    }
}
