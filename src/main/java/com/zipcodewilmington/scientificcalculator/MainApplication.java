package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");

        String[] operate = new String[100];
        int op = 0;

        double initial = 0;
        System.out.println("Current Value"+"\n" + initial);                     //For show, does nothing
        //System.out.println("Enter exit to close calculator");
        Double value1 = Console.getDoubleInput("Enter a value1");       //Input value1

        for (int i = 0; /*!operate[i].equals("exit") ||*/ i<=100; i++) {
            operate[i] = Console.getStringInput("Enter an operator. Enter 'clear' to clear");
            if (operate[i].equals("clear")){
                value1 = 0.0;
                Double value2 = 0.0;
                Double value3 = 0.0;
                System.out.println("Current Value"+"\n" + value1);
                value1 = Console.getDoubleInput("Enter a value1");
            } else {
                Double value2 = Console.getDoubleInput("Enter a value2.");    //Input value2
                Double value3 = Console.basicmath(operate[i], value1, value2);
                value1 = value3;                                                    //set value 1 is 3
                System.out.println("Current Value is " + value1);
                op++;                                                               //Keep track outside loop
            }
        }

        //Console.println("The user input %s as a string", s);        //not needed, just warmup
        //Console.println("The user input %s as a integer", val1);       //not needed, just warmup
        //Console.println("The user input %s as a d", val2);             //not needed, just warmup
        //Console.println("The output is %f", value3);
        //public static Double basicmath(args) this didn't work
        System.out.println("pff");



    }


}
