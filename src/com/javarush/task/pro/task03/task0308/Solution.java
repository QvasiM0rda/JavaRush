package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt();
        int result = 4;
        boolean xb = x > 0;
        boolean yb = y > 0;
        if (xb) {
            if (yb) {
                result = 1;
            }
        } else {
            if (yb) {
                result = 2;
            } else {
                result = 3;
            }
        }
        System.out.println(result);
    }
}
