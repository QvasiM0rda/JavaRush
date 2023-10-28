package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double doubleNumber = Double.parseDouble(string);
        int intNumber = (int) Math.round(doubleNumber);
        System.out.println(intNumber);
    }
}
