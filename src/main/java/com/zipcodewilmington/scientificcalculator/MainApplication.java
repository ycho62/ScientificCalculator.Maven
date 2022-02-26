package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        Double num1 = Console.getDoubleInput("Enter first value");
        String oper = Console.getStringInput("Enter an operator");
        Double num2 = Console.getDoubleInput("Enter second value");
        Double output = Console.getOperatorInput(oper, num1, num2);


    }
}
