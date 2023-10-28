package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = Integer.MAX_VALUE - 1, second = Integer.MAX_VALUE;
        while (input.hasNextInt()) {
            int next = input.nextInt();
            if (next < first && next < second) {
                second = first;
                first = next;
            } else if (next > first && next < second) {
                second = next;
            }
        }
        System.out.println(second);
    }
}