//Projekt TIK me zgjedhje Arbër Tusha 
//App.java

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double numA;
        double numB;
        double result = 0;
        char opperator;
        boolean validOpperation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number: ");
        numA = scanner.nextDouble();

        System.out.println("Put you opperator here: ");
        opperator = scanner.next().charAt(0);

        System.out.println("Type your second number: ");
        numB = scanner.nextDouble();

        switch (opperator) {
            case '+':
                result = numA + numB;
                validOpperation = true;
                break;
            case '-':
                result = numA - numB;
                validOpperation = true;
                break;
            case '*':
                result = numA * numB;
                validOpperation = true;
                break;
            case '/':
                result = numA / numB;
                validOpperation = true;
                break;
            default:
                System.out.println("Please use one of these opperators: | + | - | * | / |");
                validOpperation = false;
                break;
        }
        scanner.close();

        if (validOpperation) {
            System.out.println("Your result: ");
            System.out.println("----------------------------------------------");
            System.out.println(numA + " " + opperator + " " + numB + " = " + result);
        }
    }
}