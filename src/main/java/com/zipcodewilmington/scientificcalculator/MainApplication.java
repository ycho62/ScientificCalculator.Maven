package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");

        String[] operate        = new String[100];
        String[] operatetrig    = new String[100];
        double[] memory         = new double[100];


        int op = 0;
        double initial = 0;
        double value1;
        Double value2 = 0.0;
        Double value3 = 0.0;

        System.out.println("Current Value"+"\n" + initial);                    //For show, does nothing com
        //System.out.println("Enter exit to close calculator");
        value1 = Console.getDoubleInput("Enter value");       //Input value1

        for (int i = 0; i<=100; i++) {
            operate[op] = Console.getStringInput("Choose an operation. Enter 'clear' to clear");
            if (operate[op].equals("clear")){
                value1 = 0.0;
                value2 = 0.0;
                value3 = 0.0;
                System.out.println("Display Value"+"\n" + value1);
                value1 = Console.getDoubleInput("Enter value") ;
            } else if (operate[op].equals("exit")) {
                break;

            } else if (operate[op].equals("+") || operate[op].equals("-") || operate[op].equals("*") || operate[op].equals("/")){
                value2 = Console.getDoubleInput("Enter value 2.");    //Input value2
                value3 = Console.basicmath(operate[op], value1, value2);
                value1 = value3;                                                    //set value 1 is 3
                System.out.println("Display Value is " + value1);

            } else if (operate[op].equals("trig")) {
                value3 = Console.trigFunctions(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else if(operate[op].equals("exponent")) {
                value3 = Console.exponents(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else if(operate[op].equals("log")) {
                value3 = Console.log(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else {
                System.out.println("Error");
                value1 = Console.getDoubleInput("Enter a value");
            }

            op++;                                                                    //Keep track outside loop
        }

        //Console.println("The user input %s as a string", s);        //not needed, just warmup
        //Console.println("The user input %s as a integer", val1);       //not needed, just warmup
        //Console.println("The user input %s as a d", val2);             //not needed, just warmup
        //Console.println("The output is %f", value3);
        //public static Double basicmath(args) this didn't work
        System.out.println("Shutting down");



    }


}