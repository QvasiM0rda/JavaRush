package com.javarush.task.pro.task08.task0817;

/* 
Инкременты
*/

public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(1 << 4);
        System.out.println(16 >> 2);
    }
}