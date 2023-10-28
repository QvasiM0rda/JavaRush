package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int arrayMiddle = (int)Math.ceil(array.length / 2.0);
        Arrays.fill(array, 0, arrayMiddle, valueStart);
        Arrays.fill(array, arrayMiddle, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
