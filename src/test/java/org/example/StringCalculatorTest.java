package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void emptyStringTest() {
        assertEquals(0,StringCalculator.add(""));
    }




    @Test
    public void oneNumberTest() {
        assertEquals(1,StringCalculator.add("1"));
    }



    @Test
    public void twoNumbersTest() {
        assertEquals(2,StringCalculator.add("1,1"));
    }


    @Test
    public void anyNumbersTest() {
        assertEquals(9,StringCalculator.add("1,1,2,3,2"));
    }


    @Test
    public void newLineNumbersTest() {
        assertEquals(9,StringCalculator.add("1,1\n2,3,2"));
    }

    @Test
    public void delimiterTest() {
        assertEquals(236,StringCalculator.add("//;\n1;3;8,223\n1"));
    }

    @Test
    public void negativedelimiterTest() {
        assertEquals(12,StringCalculator.add("//;\n1;-3;8"));
    }

    @Test
    public void ThousandTest() {
        assertEquals(900,StringCalculator.add("//;\n400;500;1200"));
    }

    @Test
    public void LongDelimTest() {
        assertEquals(14,StringCalculator.add("//[...]\n1...2...3...8"));
    }
}