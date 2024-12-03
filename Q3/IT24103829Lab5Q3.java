import java.util.Scanner;

public class IT24103829Lab5Q3 {
    public static final int discountRateLessThan03days = 0;
    public static final int discountrate03daysto04 = 10;
    public static final int discountRateMoreThen05days = 20;
    public static final double Roomchargesforaday = 48000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start and End Dates must be between 1 and 31.");
            return;
        }

        if (startDate > endDate) {
            System.out.println("Error: Start Date must be less than End Date.");
            return;
        }

        int numbeOfDays = endDate - startDate;
        double discountRate;

        if (numbeOfDays <= 3) {
            discountRate = discountRateLessThan03days;
        }
        if (numbeOfDays <= 4) {
            discountRate = discountrate03daysto04;
        } else {
            discountRate = discountRateMoreThen05days;
        }

        double discountAmount =(discountRate/100.0)*(numbeOfDays*Roomchargesforaday);
        double totalAmountToPay=(numbeOfDays*Roomchargesforaday)-discountAmount;


        System.out.println("Number of Days Reserved: " + numbeOfDays);
        System.out.println("Room Charge Per Day: Rs. " +Roomchargesforaday+ "/-");
        System.out.println("Total Amount to be Paid: Rs. " + totalAmountToPay);
    }
}
