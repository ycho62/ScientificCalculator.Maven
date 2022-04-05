package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");

        int op = 0;
        double initial = 0;
        double value1;
        double value2 = 0.0;
        double value3 = 0.0;
        double memory = 0;
        double store = 0;
        int loop = 100;
        int wholenumber;

        String[] operate        = new String[loop];
        String wholechoice;

        System.out.println("Current Value"+"\n" + initial);           //For show, does nothing com
        //System.out.println("Enter exit to close calculator");
        //value1 = Console.getDoubleInput("Enter value");       //Input value1

        value1 = Console.checkDouble("Enter value"); //Add this function instead
        int value7 = Console.checkDouble("Enter value")
        for (int i = 0; i<= loop; i++) {

            System.out.println("Current value = " + value1);
            operate[op] = Console.getStringInput("Choose an operation. Enter 'help' for list'");

            if (operate[op].equals("clear")){
                value1 = 0.0;
                value2 = 0.0;
                value3 = 0.0;
                System.out.println("Display Value"+"\n" + value1);
                value1 = Console.checkDouble("Enter value") ;
            } else if (operate[op].equals("exit")) {
                break;

            } else if (operate[op].equals("+") || operate[op].equals("-") || operate[op].equals("*") || operate[op].equals("/")){
                value2 = Console.checkDouble("Enter value");          //Input value2
                value3 = Console.basicmath(operate[op], value1, value2);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else if (operate[op].equals("trig")) {
                value3 = Console.trigFunctions(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;

            } else if (operate[op].equals("help")) {
                System.out.println("Following commands are available " +
                        "\n Basic Operations: + - / * \n Trigonomatry: trig \n" +
                        "Numeral system(Binary, hexa, etc): numtype \n" +
                        "Exponential functions: expo \n" +
                        "Logarithmic: log \n" +
                        "invert sign: sign\n" +
                        "store memory: store\n" +
                        "pull memory: pull\n" +
                        "check memory: memory\n" +
                        "clear memory: clearmem \n" +
                        "invert value: invert\n" +
                        "inverse value: inverse\n" +
                        "exponent options: exponent\n");

            } else if (operate[op].equals("numtype")) {        //binary stuff
                wholenumber = (int) value1;          //convert to integer
                if ( (value1 % 1) != 0){              //checks for whole number
                    System.out.println(value1 +" is not a whole number. \n Convert to whole number?");
                    wholechoice = Console.getStringInput("y/n");
                    if (wholechoice.equals("y") || wholechoice.equals("y")){
                        System.out.println(value1 + " has been converted to " + wholenumber);
                        Console.numtype(wholenumber);                            //call the numtype method
                    } else {                        //do nothing
                    }
                } else {
                    Console.numtype(wholenumber);  //call the numtype method
                }
            } else if (operate[op].equals("store")){            //store memory
                store = Console.store(value1);
            } else if (operate[op].equals("pull")){             //pull memory
                value1 = store;
            } else if (operate[op].equals("memory")){
                System.out.println("Value stored = " + store);
            } else if (operate[op].equals("clearmem")){
                store = 0;
            } else if (operate[op].equals("invert")){
                value3 = Console.invert(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else if (operate[op].equals("inverse")){
                value3 = Console.inverse(value1);
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
            } else if (operate[op].equals("factorial")){
                value3 = Console.factorial(value1);
                System.out.println("Display Value is " + value3);
                value1 = value3;
            } else {
                System.out.println("Error");  //Modify this section more for value3 != 0
                value1 = Console.checkDouble("Enter value");
            }

            loop++;
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