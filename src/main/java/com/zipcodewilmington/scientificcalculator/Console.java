package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);

    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }


    public static Integer getIntegerInput(String prompt) {
        Scanner intscan = new Scanner(System.in);
        println(prompt);
        Integer int1 = intscan.nextInt();

        return int1;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner dubscan = new Scanner(System.in);
        println(prompt);
        Double double1 = dubscan.nextDouble();

        return double1;
    }

    public static Double basicmath(String operate, double value1, double value2) {
        double value3 = 0;

        String error;
        if (operate.equals("+")) {
            value3 = value1 + value2;
        } else if (operate.equals("-")) {
            value3 = value1 - value2;
        } else if (operate.equals("*")) {
            value3 = value1 * value2;
        } else if (operate.equals("/")) {
            if (value2 == 0) {
                System.out.println("Arrrr");
            } else {
                value3 = value1 / value2;
            }
        } else {
            System.out.println("That's not an operator!");
        }

        return value3;

    }

/*    public static String basicmath2(String test){
        Double valtest1 = Console.getDoubleInput("Enter a value");
        for (int i = 0, !operator.equals("exit"), i++) {
            Double val1 = Console.getDoubleInput("Enter a value1");    //value1
            //String operator = Console.getStringInput("Enter an operator"); //get operator
            Double val2 = Console.getDoubleInput("Enter a value2.");       //value2
            Double value3 = Console.basicmath(operator, val1, val2);
            value1 = value3;
        }
        return String.format("%s", 1);
    }*/

    public static String getStringArray(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }


    //Yun's code
    public static double exponents (double value1){
        System.out.println("options: square, square root, exponentiation, inverse, invert");
        Scanner in = new Scanner(System.in);
        String operate1 = in.nextLine();
       double value3 = 0;
    switch (operate1) {
        case "square":
            value3 = value1 * value1;
            System.out.println("Square of " + value1 +" = " + value3);
            break;
        case "square root":
            value3 = Math.sqrt(value1);
            System.out.println("Square root of " + value1 +" = " + value3);
            break;
        case "exponentiation":
            System.out.println("Enter value 2");
            double value2 = in.nextDouble();
            value3 = Math.pow(value1, value2);
            System.out.println("Exponentiation of " + value1 + " to " + value2 + " = " + value3);
            break;
        case "inverse":
            value3 = 1 / value1;
            System.out.println(value3);
            break;
        case "invert":
            value3 = value1 * -1;
            System.out.println(value3);
            break;
        default:
            break;

    }
        return value3;
    }

    public static double trigFunctions(double value1) {

        double output = 0;
        Scanner in = new Scanner(System.in);

        //if (operate1.equals("sin") || operate1.equals("cos") || operate1.equals("tan") || operate1.equals("inverse sin") || operate1.equals("inverse cos") || operate1.equals("inverse tan"))
        //;
        System.out.println("radians or degrees?");
        String radiansOrDegrees = in.nextLine();

        System.out.println("Pick a trig - sin cos tan asin acos atan");
        String operate1 = in.nextLine();

        if (radiansOrDegrees.equals("degrees") || radiansOrDegrees.equals("Degrees")) {

            switch (operate1) {
                case "sin":
                    output = Math.sin(Math.toRadians(value1));
                    System.out.println("degrees sin(" + value1 +") = " + output);
                    break;
                case "cos":
                    if (value1 == 90) {
                        output = Math.round(Math.cos(Math.toRadians(value1)));
                        System.out.println("degrees cos(" + value1 +") = " + output);
                    } else {
                        output = Math.cos(Math.toRadians(value1));
                        System.out.println("degrees cos(" + value1 +") = " + output);
                    }
                    break;
                case "tan":
                    output = Math.tan(Math.toRadians(value1));
                    System.out.println("degrees tan(" + value1 +") = " + output);
                    break;
                case "asin":
                    output = Math.asin(Math.toRadians(value1));
                    System.out.println("degrees asin(" + value1 +") = " + output);
                    break;
                case "acos" :
                    output = Math.acos(Math.toRadians(value1));
                    System.out.println("degrees acos(" + value1 +") = " + output);
                    break;
                case "atan":
                    output = Math.atan(Math.toRadians(value1));
                    System.out.println("degrees atan(" + value1 +") = " + output);
                    break;
                default:
                    break;
            }

        } else {

            switch (operate1) {
                case "sin":
                    output = Math.sin(value1);
                    System.out.println("radian sin(" + value1 +") = " + output);
                    break;
                case "cos":
                    output = Math.cos(value1);
                    System.out.println("radian cos(" + value1 +") = " + output);
                    break;
                case "tan":
                    output = Math.tan(value1);
                    System.out.println("radian tan(" + value1 +") = " + output);
                    break;
                case "asin":
                    output = Math.asin(value1);
                    System.out.println("radian asin(" + value1 +") = " + output);
                    break;
                case "acos":
                    output = Math.acos(value1);
                    System.out.println("radian acos(" + value1 +") = " + output);
                    break;
                case "atan":
                    output = Math.atan(value1);
                    System.out.println("radian atan(" + value1 +") = " + output);
                    break;
                default:
                    break;
            }
        }
        return output;
    }
    public static double logs (double value1){
        System.out.println("options: log, 1/log, ln, 1/ln");
        Scanner in = new Scanner(System.in);
        String operate1 = in.nextLine();
        double value3 = 0;
        switch (operate1) {
            case "log":
                value3 = Math.log(value1);
                System.out.println("log of " + value1 +" = " + value3);
                break;
            case "1/log":
                value3 = Math.(value1);
                System.out.println("log of " + value1 +" = " + value3);
                break;
}