import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator V0.1");
        System.out.println("--------------------------");
        System.out.println("Choose a Logical Operation \n");

        Scanner Input = new Scanner(System.in);

        boolean Calculating = true;
        boolean IsValid = true;

        while (Calculating) {
            System.out.println("1. Addition (Add)");
            System.out.println("2. Subtraction (Sub)" );
            System.out.println("3. Multiplication (Mult)");
            System.out.println("4. Division (Div)");
            System.out.println("5. Exit \n");

            try {
                System.out.print("Logical Operator Chosen: ");
                String Logical_Choice = Input.nextLine();
                if (Logical_Choice.equals("exit")||Logical_Choice.equalsIgnoreCase("5")){
                    Calculating = false;
                    IsValid = false;
                }

                //calling of function


                if (IsValid == true) {
                    Calculator(Input, Logical_Choice);
                }
            } catch (InputMismatchException e) {
                System.out.println("Input does not match any choices.");
            }
        }
        System.out.println("Program has shut down.");
    }
    private static void Calculator(Scanner Input,String Logical_Choice) {
        try {
            double NumberOne = 0;
            double NumberTwo = 0;
            double answer = 0;

            System.out.print("Please enter your first Number: ");
            NumberOne = Input.nextDouble();
            Input.nextLine();

            System.out.print("Please enter your second Number: ");
            NumberTwo = Input.nextDouble();
            Input.nextLine();

            if (Logical_Choice.equalsIgnoreCase("Add") || Logical_Choice.equalsIgnoreCase("1")) {
                answer = NumberOne + NumberTwo;
            } else if (Logical_Choice.equalsIgnoreCase("Sub") || Logical_Choice.equalsIgnoreCase("2")) {
                answer = NumberOne - NumberTwo;
            } else if (Logical_Choice.equalsIgnoreCase("Mult") || Logical_Choice.equalsIgnoreCase("3")) {
                answer = NumberOne * NumberTwo;
            } else if (Logical_Choice.equalsIgnoreCase("Div") || Logical_Choice.equalsIgnoreCase("4")) {
                answer = NumberOne / NumberTwo;
            }
            System.out.println("\n--------------------------");
            System.out.println("The answer is: " + answer);
            System.out.println("\n--------------------------");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Number, returning to main menu");
            return;
        }//end of catch
    }//end of Maths Calc
}//class