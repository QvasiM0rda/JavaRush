package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        while (height < 10) {
            int width = 0;
            while (width < 20) {
                boolean isSide = width == 0 || width == 19;
                boolean isTopOrBottom = height == 0 || height == 9;
                String ch = isSide || isTopOrBottom ? "Б" : " ";
                System.out.print(ch);
                width++;
            }
            System.out.println();
            height++;
        }
    }
}