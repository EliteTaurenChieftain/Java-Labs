package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int startIndex = numbers.indexOf("//");
            int endIndex = numbers.indexOf("\n");
            if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
                String customDelimiter = numbers.substring(startIndex + 2, endIndex);
                if (customDelimiter.length() == 1) {
                    delimiter = customDelimiter;
                    numbers = numbers.substring(endIndex + 1);
                }
            }
        }

        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();
        String[] numberArray = numbers.split(Pattern.quote(delimiter) + "|\\n|,");
        for (String num : numberArray) {
            if (parseNum(num) < 0) {
                negativeNumbers.add(parseNum(num));
            }
            if (parseNum(num) < 1000) {
                sum += parseNum(num);
            }
        }
        if (!negativeNumbers.isEmpty()) {
            try {
                throw new Exception("Negative number entered" + negativeNumbers);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }



    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        int result4 = StringCalculator.add("//;\n1;1001;800");
        System.out.println(result4);
    }
}
