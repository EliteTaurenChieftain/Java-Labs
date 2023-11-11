package org.example;

import java.util.ArrayList;
import java.util.List;

public class  StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int startIndex = numbers.indexOf("//");
            int endIndex = numbers.indexOf("\n");
            if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                delimiter = numbers.substring(startIndex + 2, endIndex);
                numbers = numbers.substring(endIndex + 1);
            }
        }

        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;
        String[] numberArray = numbers.split("[" + delimiter + "]|\\n|,");
        for (String num : numberArray) {
            if (!num.isEmpty()) {
                int parsedNum = parseNum(num);
                if (parsedNum < 0) {
                    negativeNumbers.add(parsedNum);
                }
                if (parsedNum <= 1000) {
                    sum += parsedNum;
                }
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }

    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {

         int result5 = StringCalculator.add("");



        System.out.println(result5);



    }
}
