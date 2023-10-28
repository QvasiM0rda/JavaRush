package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = input.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            String currentValue = strings[i];
            boolean isRepeat = false;
            if (currentValue == null) {
                continue;
            }
            for (int j = i + 1; j < 6; j++) {
                if (strings[j] == null) {
                    continue;
                }
                if (strings[j].equals(currentValue)) {
                    isRepeat = true;
                    strings[j] = null;
                }
            }
            if (isRepeat) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
