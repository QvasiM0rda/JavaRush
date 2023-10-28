package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        String result = Math.abs(a - b) < 0.000001 ? "числа равны" : "числа не равны";
        System.out.println(result);
    }
}
