import java.util.Scanner;

public class IT24103829Lab5Q2{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number of new members introduced: ");
        int newmembers =input.nextInt();
         
        if (newmembers< 0) {
            System.out.println("Input must be a number 0 or greater");
        }
        switch (newmembers) {
            case 0:System.err.println("No Prize");
            break;
            case 1:System.err.println("Prize is a :pen");
            break;
            case 2:System.err.println("Prize is a :Umbrella");
            break;
            case 3:System.err.println("Prize is a :Bag");
            break;
            case 4:System.err.println("Prize is a :Travelling Chair");
            break;
            default:System.err.println("Prize is a :Headphone");
            break;
            
        }
    
    }

}
