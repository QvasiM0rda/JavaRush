package com.javarush.task.pro.task05.task0505;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N > 0) {
            int[] intArray = new int[N];
            for (int i = 0; i < N; i++) {
                intArray[i] = input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (N % 2 == 0) {
                    System.out.println(intArray[N - i - 1]);
                } else {
                    System.out.println(intArray[i]);
                }
            }
        }
    }
}
