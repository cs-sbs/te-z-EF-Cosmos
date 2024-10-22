package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.example.OddEven;

public class NumberFeature {


    public static int isOddorEven(int num){
        int odd =0;
        int even =0;
        if ((num & 1) == 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑




        String numberStr = Integer.toString(inputNumber);
        
        // 创建一个线性表来存储每个数字
        List<Integer> numberList = new ArrayList<>();
        
        // 遍历字符串的每个字符
        for (int i = 0; i < numberStr.length(); i++) {
            // 将字符转换为整数并添加到线性表中
            int digit = Character.getNumericValue(numberStr.charAt(i));
            numberList.add(digit);
        }


        List<Integer> binaryList = new ArrayList<>();
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            System.out.println(numberStr.length()-i);
            boolean CompareNumberWithLocation = isOddorEven(numberStr.length()-i) == isOddorEven(numberList.get(i));
            binaryList.add(CompareNumberWithLocation ? 1 : 0);
            result += (int)Math.pow(2,numberStr.length()-i-1)*binaryList.get(numberStr.length()-i-1);
        }
        //System.out.println(numberStr.length());
        System.out.println(numberList);
        System.out.println(binaryList);
        System.out.println(result);
    }
}