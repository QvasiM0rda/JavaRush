package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(), b = console.nextInt(), c = console.nextInt();
        System.out.println((a + b + c) / 3);
    }
}
