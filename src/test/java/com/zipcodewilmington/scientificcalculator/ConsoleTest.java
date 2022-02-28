package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleTest {

    @Test
    void print() {
    }

    @Test
    void println() {
    }

    @Test
    void checkDouble() {
    }

    @Test
    void getStringInput() {
    }

    @Test
    void getIntegerInput() {
    }

    @Test
    void getDoubleInput() {
    }

    @Test
    void basicmath() {
            Console add = new Console();
            double result = add.basicmath("+", 10, 10);
            double expected = 20.0;
            assertEquals(expected,result);

            Console subtract = new Console();
            double result1 = subtract.basicmath("-", 10, 10);
            double expected1 = 0;
            assertEquals(expected1,result1);

            Console times = new Console();
            double result2 = times.basicmath("*", 10, 10);
            double expected2 = 100;
            assertEquals(expected2,result2);

            Console divide = new Console();
            double result3 = divide.basicmath("/", 10, 10);
            double expected3 = 1;
            assertEquals(expected3,result3);

//            Console divideZero = new Console();
//            double result4 = divideZero.basicmath("/", 10, 0);
//            String expected4 = "Arrrr";
//            assertEquals(expected4,result4);

//            Console otheroperate = new Console();
//            String result5 = otheroperate.basicmath("t",null ,null);
//            String expected5 = "That's not an operator!";
//            assertEquals(expected5,result5);
    }

    @Test
    void getStringArray() {
    }

    @Test
    void trigFunctions() {
        Console trig = new Console();

        assertEquals(trig.trigFunctions(90), 1);



    }

    @Test
    void numtype() {
    }

    @Test
    void store() {
    }

    @Test
    void exponents() {
    }

    @Test
    void invert() {
    }

    @Test
    void inverse() {
    }

    @Test
    void log() {
    }

    @Test
    void factorial() {
    }
}