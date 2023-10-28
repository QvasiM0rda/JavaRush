package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (input.hasNextInt()) {
            sum += input.nextInt();
        }
        System.out.println(sum);
    }
}