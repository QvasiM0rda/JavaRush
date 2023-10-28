package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Через тернии...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "число меньше 5";
        if (number == 5) {
            result = "число равно 5";
        } else if (number > 5) {
            result = "число больше 5";
        }
        System.out.println(result);
    }
}
