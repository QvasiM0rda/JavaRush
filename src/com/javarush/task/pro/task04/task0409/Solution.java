package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.hasNextInt() ? input.nextInt() : Integer.MAX_VALUE;
        while (input.hasNextInt()) {
            int next = input.nextInt();
            min = next < min ? next : min;
        }
        System.out.println(min);
    }
}