import java.util.Scanner;

public class IT24103829Lab5Q1{
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
       
        System.out.print("Enter the first integer: ");
        int num01 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num02 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num03 = input.nextInt();

        System.out.println("User entered numbers are: " + num01 + " " + num02 + " " + num03);  

        if(num01<num02 && num01<num03){
        System.out.println("The smallest number :"+num01 );   
        }
        if(num01>num02 && num01>num03){
        System.out.println("The Largest number :"+num01);
        }
        if(num02<num01 && num02<num03){
            System.out.println("The smallest number :"+num02);   
        }
        if(num02>num01 && num02>num03){
              System.out.println("The Largest number :"+num02);
         }

         if(num03<num01 && num03<num01){
            System.out.println("The smallest number :"+num03);   
        }

        if(num03>num01 && num03>num01){
            System.out.println("The Largest number :"+num03);
       }
   }

}