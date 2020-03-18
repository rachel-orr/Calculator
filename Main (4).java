import java.util.*;

public class Calculator {
    public static void main (String args[]) {
        
        /* THIS IS A GITHUB COMMENT */
        
        /*The above comment is incorrect. THIS is the first github comment. The above comment
        was made in the original file on my IDE, because i didnt understand what making a 
        branch entailed. Thsi comment was made by making a branch and editing the code, thus making
        an actual edit. */
        
        
        //Set variables
        Scanner scan = new Scanner(System.in);
        double op1, op2;
        int choice;
        
        //This is my second github comment. I am doing it for practice.
        //I am also adding a print statement, just for kicks.
        System.out.println("Hello World!");
        
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










