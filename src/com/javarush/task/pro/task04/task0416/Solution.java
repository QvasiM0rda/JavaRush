package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cans = input.nextInt(), peps = input.nextInt();
        System.out.println(1.0 * cans / peps);
    }
}