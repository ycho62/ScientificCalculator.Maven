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
    public static double trigFunctions(double value1) {

        double output = 0;
        Scanner in = new Scanner(System.in);

        //if (operate1.equals("sin") || operate1.equals("cos") || operate1.equals("tan") || operate1.equals("inverse sin") || operate1.equals("inverse cos") || operate1.equals("inverse tan"))
        //;
        System.out.println("Radians or degrees?");
        String radiansOrDegrees = in.nextLine();
        String radians = in.nextLine();

        if (radiansOrDegrees.equals("degrees")) {
            System.out.println("You've chose degrees");
            System.out.println("Pick a trig");
            String operate1 = in.nextLine();

            switch (operate1) {
                case "sin":
                    output = (Math.sin(Math.toRadians(value1)));
                    break;
                case "cos":
                    output = Math.round((Math.cos(Math.toRadians(value1))));
                    break;
                case "tan":
                    output = (Math.tan(Math.toRadians(value1)));
                    break;
                case "inverse sin":
                    output = (1 / (Math.sin(Math.toRadians(value1))));
                    break;
                case "inverse cos":
                    output = (1 / (Math.cos(Math.toRadians(value1))));
                    break;
                case "inverse tan":
                    output = (1 / (Math.tan(Math.toRadians(value1))));
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Pick a trig");
            String operate1 = in.nextLine();

            switch (operate1) {
                case "sin":
                    output = (Math.sin(value1));
                    break;
                case "cos":
                    output = (Math.cos(value1));
                    break;
                case "tan":
                    output = (Math.tan(value1));
                    break;
                case "inverse sin":
                    output = (1 / (Math.sin(value1)));
                    break;
                case "inverse cos":
                    output = (1 / (Math.cos(value1)));
                    break;
                case "inverse tan":
                    output = (1 / (Math.tan(value1)));
                    break;
                default:
                    break;
            }
            in.close();
        }
        return output;
    }
}