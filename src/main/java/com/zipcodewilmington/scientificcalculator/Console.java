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


            //testing theory
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
                    "octa \n" +
                    "hex \n");
            pick = in.nextLine();
        }

    }
}

