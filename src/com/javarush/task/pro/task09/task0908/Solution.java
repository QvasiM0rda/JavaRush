package com.javarush.task.pro.task09.task0908;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static final String HEX = "0123456789abcdef";
    public static final String[] HEX_TO_BINARY= {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
            "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null) {
            return "";
        }
        Pattern notBinaryPattern = Pattern.compile("[^01]+");
        Matcher notBinaryMatcher = notBinaryPattern.matcher(binaryNumber);
        if (notBinaryMatcher.find()) {
            return "";
        }
        String hexNumber = "";

        while (binaryNumber.length() % 2 != 0) {
            binaryNumber = 0 + binaryNumber;
        }
        Pattern pattern = Pattern.compile("[0-1]{4}");
        Matcher matcher = pattern.matcher(binaryNumber);
        while (matcher.find()) {
            int decimal = binaryToDecimal(matcher.group());
            hexNumber += Character.toString(HEX.charAt(decimal));
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null) {
            return "";
        }
        Pattern notHexPattern = Pattern.compile("[^0-9a-f]");
        Matcher notHexMatcher = notHexPattern.matcher(hexNumber);
        if (notHexMatcher.find()) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            int index = HEX.indexOf(hexNumber.charAt(i));
            binaryNumber += HEX_TO_BINARY[index];
        }
        return binaryNumber;
    }

    public static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int multiplier = 1;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char charAtIndex = binaryNumber.charAt(i);
            int numberAtIndex = Character.getNumericValue(charAtIndex);
            decimalNumber += numberAtIndex * multiplier;
            multiplier *= 2;
        }
        return decimalNumber;
    }
}
