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
    public static Scanner getOperatorInput(String oper, double num1, double num2) {
        char operator;
//        double num1, num2;
//        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Amazing Calculator!");
//        num1 = input.nextDouble();
        operator = input.next().charAt(0);
//        num2 = input.nextDouble();

//        input.close();

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
            default:
                System.out.println("%c is not an operator!");
                return input;
        }
        return input;
    }
}
