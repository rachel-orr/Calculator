import java.util.*;

public class Calculator {
    public static void main (String args[]) {
        
        //Set variables
        Scanner scan = new Scanner(System.in);
        double op1, op2;
        int choice;
        
        
        //Enter operands
        System.out.print("Enter first operand: ");
        op1 = scan.nextDouble();
        System.out.print("Enter second operand: ");
        op2 = scan.nextDouble();
        
        
        //Display Calculator Menu
        System.out.println("Calculator Menu");
        System.out.println("- - - - - - - - - - - - - - - \n1. Addition" + 
        "\n2. Subtraction \n3. Multiplication \n4. Division");
        
        
        //Have user choose operation
        System.out.println("Which operation do you want to perform?");
        choice = scan.nextInt();
        
        
        //Eliminate invalid choices
        if ( choice >= 5) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
        else if ( choice < 1) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
        else {
            //actual calculator work begins here !
            if (choice == 1 ) {
                System.out.println("The result of the operation is " + (op1 + op2) + 
                ". Goodbye!");
            }
            else if (choice == 2) {
                System.out.println("The result of the operation is " +
                (op1 - op2) + ". Goodbye!");
            }
            else if (choice == 3) {
                System.out.println("The result of the operation is " +
                (op1*op2) + ". Goodbye!");
            }
            else if (choice == 4) {
                System.out.println("The result of the operation is " +
                (op1/op2) + ". Goodbye!");
            }
            else {
                System.out.println("Error: Invalid selection! Terminating program.");
            }
        }
    }
}










