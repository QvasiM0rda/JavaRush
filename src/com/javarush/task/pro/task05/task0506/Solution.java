package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < N; i++) {
            min = array[i] < min ? array[i] : min;
        }
        System.out.println(min);
    }
}
