import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to the calcluator\nEnter a command: ");

        String[] function = myObj.nextLine().split(" ");
        switch (function[0]){
            case "add": System.out.println(calc.add(Integer.parseInt(function[1]),Integer.parseInt(function[2])));
                break;
            case "multiply": System.out.println(calc.multiply(Integer.parseInt(function[1]),Integer.parseInt(function[2])));
                break;
            case "subtract": System.out.println(calc.subtract(Integer.parseInt(function[1]),Integer.parseInt(function[2])));
                break;
            case "divide": System.out.println(calc.divide(Integer.parseInt(function[1]),Integer.parseInt(function[2])));
                break;
            case "fibonacci": System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(function[1])));
                break;
            case "binary": System.out.println(calc.intToBinaryNumber(Integer.parseInt(function[1])));
            break;
        }

    }
}
