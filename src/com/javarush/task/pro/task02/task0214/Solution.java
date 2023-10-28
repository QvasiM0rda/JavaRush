package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
        String second = console.nextLine();
        String third = console.nextLine();
        
        System.out.println(third);
        System.out.println(second.toUpperCase());
        System.out.println(first.toLowerCase());
    }
}
