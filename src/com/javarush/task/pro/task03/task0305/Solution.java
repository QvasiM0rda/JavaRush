package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a == b) {
            if (a == c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else if (b == c){
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}
