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
        Scanner integerScanner = new Scanner(System.in);
        println(prompt);
        Integer int1 = integerScanner.nextInt();
        return int1 ;}

    public static Double getDoubleInput(String prompt) {
        Scanner doubleScanner = new Scanner(System.in);
        println(prompt);
        double dub1 = doubleScanner.nextDouble();
        return dub1;
    }
    public static Double getOperatorInput(String oper, double num1, double num2) {
        char operator;
        System.out.println("Welcome to our Amazing Calculator!");
        operator = oper.charAt(0);
        double output = 0;


        switch(operator) {
            case '+':
                System.out.printf("%.2f + %.2f= %.2f", num1,num2,(num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f= %.2f", num1,num2,(num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f= %.2f", num1,num2,(num1 * num2));
                break;
            case '/':
                if (num2 !=0) {
                    System.out.printf("%.2f / %.2f= %.2f", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Can not divide by 0!");
                }
                break;
            default:
                System.out.println("%c is not an operator!");
                return output;
        }
        return output;
    }
}
