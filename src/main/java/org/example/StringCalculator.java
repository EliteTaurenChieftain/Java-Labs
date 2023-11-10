package org.example;

public class  StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        String[] numberArray = numbers.split("[,\\n]");
        for (String num : numberArray) {
            sum += parseNum(num);
        }
        return sum;
    }

    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        int result4 = StringCalculator.add("1,2\n3,5");
        System.out.println(result4);
    }
}