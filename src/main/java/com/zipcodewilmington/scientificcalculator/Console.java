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

    public static double checkDouble(String value){
        Scanner in = new Scanner(System.in);
        //String val = in.nextLine();
        double x = 0;
        Boolean pass = false;


        while (!pass){
        System.out.print("Enter a number: ");
            if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            } else {
            x = in.nextDouble();
            pass = true;
            }
        }
        return x;
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

    public static String getStringArray(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }


    //Yun's code
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

    public static void numtype(int value1){

        String binary1  = Integer.toBinaryString(value1);
        String octa1    = Integer.toOctalString(value1);
        String hexa1    = Integer.toHexString(value1);
        String pick;
        Scanner in = new Scanner(System.in);

        System.out.println("Select a number system \n" +
                "binary \n" +
                "octal \n" +
                "hex \n" +
                "exit");

        pick = in.nextLine();

        while(!pick.equals("exit")) {

            switch (pick) {
                case "binary":
                    System.out.println("Binary value for " + value1 + " is " + binary1);
                    break;
                case "octal":
                    System.out.println("Octal value for " + value1 + " is " + octa1);
                    break;
                case "hex":
                    System.out.println("Hexadecimal value for " + value1 + " is " + hexa1);
                    break;
                default:
                    System.out.println("invalid entry");
            }

            System.out.println("Select a number system \n" +
                    "binary \n" +
                    "octal \n" +
                    "hex \n");
            pick = in.nextLine();
        }



    }

    public static double store(double value1){
        double store;

        store = value1;

        return store;
    }

    public static double exponents(double value1) {
        System.out.println("options: square, square root, exponentiation, inverse, invert");
        Scanner in = new Scanner(System.in);
        String operate1 = in.nextLine();
        double value3 = 0;
        switch (operate1) {
            case "square":
                value3 = value1 * value1;
                System.out.println("Square of " + value1 + " = " + value3);
                break;
            case "square root":
                value3 = Math.sqrt(value1);
                System.out.println("Square root of " + value1 + " = " + value3);
                break;
            case "exponentiation":
                System.out.println("Enter value 2");
                double value2 = in.nextDouble();
                value3 = Math.pow(value1, value2);
                System.out.println("Exponentiation of " + value1 + " to " + value2 + " = " + value3);
                break;
            default:
                break;

        }
        return value3;
    }

    public static double invert (double value1){
        double output = 0;
        output = value1 * -1;
        System.out.println("Inverted value of " + value1 + " = " + output);
        return output;
    }

    public static double inverse (double value1){
        double output = 0;
        output = 1 / value1;
        System.out.println("Inverse value of " + value1 + " = " + output);

        return output;
    }

    public static double log(double value1) {
        System.out.println("options: log, 10^x, ln, e^x");
        Scanner in = new Scanner(System.in);
        String operate1 = in.nextLine();
        double value3 = 0;
        switch (operate1) {
            case "log":
                value3 = Math.log10(value1);
                System.out.println("log (" + value1 + ") = " + value3);
                break;
            case "10^x":
                value3 = (Math.pow(10, value1));
                System.out.println("10 to the " + value1 + " = " + value3);
                break;
            case "ln":
                value3 = Math.log(value1);
                System.out.println("e^(ln" + value1 + ") = " + value3);
                break;
            case "e^x":
                value3 = Math.exp(value1);
                System.out.println("e^ " + value1 + " = " + value3);
                break;
        }
        return value3;
    }

    public static double factorial (double value){

        double output = 1;

        for (int i = 1; i <= value; i++) {
            output *= i;
        }

        return output;
    }

}

