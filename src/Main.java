import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the net price of the product: ");
        double netPrice = scanner.nextDouble();

        scanner.close();


        double vatRate = 0.23;
        double grossValue = netPrice * (1 + vatRate);


        double totalValueExcludingVAT = grossValue * 10000;

        // Print the results
        System.out.println("Net Price: " + netPrice);
        System.out.println("Gross Value with 23% VAT: " + grossValue);
        System.out.println("Total Value for 10,000 products (excluding VAT): " + totalValueExcludingVAT);

    }
}