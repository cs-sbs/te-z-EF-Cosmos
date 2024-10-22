package org.example;

import java.util.Scanner;

import java.util.Scanner;
public class OddEven {

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
        Scanner scanner = new Scanner(System.in);
        int countOdd = 0;
        int countEven = 0;

        while (true) {
            int num = scanner.nextInt();  // 读取输入
            if (num == -1) {              // 如果是-1则结束输入
                break;
            }

            // 使用位运算符判断奇偶
            if ((num & 1) == 0) {
                countEven++;  // 偶数
            } else {
                countOdd++;   // 奇数
            }
        }
        System.out.println(countOdd + " " + countEven);
    }
}

