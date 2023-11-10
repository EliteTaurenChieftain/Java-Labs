package org.example;

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
        String[] numberArray = numbers.split(Pattern.quote(delimiter) + "|\\n|,");
        for (String num : numberArray) {
            sum += parseNum(num);
        }
        return sum;
    }

    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        int result4 = StringCalculator.add("//;\n1;2;8,81,1\n1");
        System.out.println(result4);
    }
}
