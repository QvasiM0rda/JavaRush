package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        multiArray = new int[input.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[input.nextInt()];
        }
    }
}
