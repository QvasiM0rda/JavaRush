package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minValue = ints[0];
        for (int i = 1; i < ints.length; i++) {
            minValue = Math.min(minValue, ints[i]);
        }
        return minValue;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
