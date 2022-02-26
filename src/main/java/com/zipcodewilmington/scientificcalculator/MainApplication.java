package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");

        String[] operate = new String[100];

        double initial = 0;
        System.out.println("Current Value"+"\n" + initial);
        System.out.println("Enter exit to close calculator");
        Double value1 = Console.getDoubleInput("Enter a value1");

        for (int i = 0; /*!operate[i].equals("exit") ||*/ i<=100; i++) {
            operate[i] = Console.getStringInput("Enter an operator");
            Double val2 = Console.getDoubleInput("Enter a value2.");       //value2
            Double value3 = Console.basicmath(operate[i], value1, val2);
            value1 = value3;
            System.out.println("Current Value is " + value1);
        }

        //Console.println("The user input %s as a string", s);        //not needed, just warmup
        //Console.println("The user input %s as a integer", val1);       //not needed, just warmup
        //Console.println("The user input %s as a d", val2);             //not needed, just warmup
        //Console.println("The output is %f", value3);
        //public static Double basicmath(args) this didn't work
        System.out.println("pff");



    }


}
