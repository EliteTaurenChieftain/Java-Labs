package org.example;

public class  StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        String[] numberArray = numbers.split(",");
        for (String num : numberArray) {
            sum += parseNum(num);
        }
        return sum;
    }

    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        int result3 = StringCalculator.add("1,2,3,4");      // Returns 3
        System.out.println(result3);
    }
}