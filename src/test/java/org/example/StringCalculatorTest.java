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
        assertEquals(12,StringCalculator.add("//;\n1;3;8,223\n1"));
    }

}