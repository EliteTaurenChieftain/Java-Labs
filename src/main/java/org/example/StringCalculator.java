package org.example;

public class  StringCalculator {
    public static int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String[] numberArray = numbers.split(",");
        if(numberArray.length == 1){
            return parseNum(numberArray[0]);
        } else if(numberArray.length ==2){
            int num1 = parseNum(numberArray[0]);
            int num2 = parseNum(numberArray[1]);
            return num1 + num2;
        } else {
            throw new IllegalArgumentException("Input can't contain more than two numbers");
        }
    }
    public static int parseNum(String num) {
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        int result1 = StringCalculator.add("");         // Returns 0
        int result2 = StringCalculator.add("1");        // Returns 1
        int result3 = StringCalculator.add("1,2");      // Returns 3
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}