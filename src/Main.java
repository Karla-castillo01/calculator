import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //CREATE AN INSTANCE OF SCANNER OBJECT
        Scanner myScanner = new Scanner(System.in);

        // get desired operator +-/*
        // get two numbers, add them together, and display the sum
        // add them together
        // and display the sum

        System.out.println(" Enter a single operator.\ne.g. '+','-' or '*','/':\n ");
        String operator = myScanner.next();

        System.out.print("Enter first number: ");
        // read next integer from the input stream (console/terminate)
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number: ");
        // read second integer from the input stream AKA console
        int num2 = myScanner.nextInt();

        // total up the two together into a sum
        int result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if(operator.equals("-")){
            result = num1 - num2;
        } else if(operator.equals("*")){
            result = num1 * num2;
        } else if(operator.equals("/")){
            result = num1 / num2;
        }

        System.out.println("The sum is " + result);
    }
}