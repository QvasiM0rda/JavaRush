package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int next, max = Integer.MIN_VALUE;
        while (input.hasNextInt()) {
            next = input.nextInt();
            max = (next % 2 == 0 && next > max) ? next : max;
        }
        System.out.println(max);
    }
}