package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int number = input.nextInt();
        do {
            System.out.println(text);
            number--;
        } while (number > 0 && number < 4);
    }
}