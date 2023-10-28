package com.javarush.task.pro.task15.task1506;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String source = scanner.nextLine();
            var lines = Files.readAllLines(Path.of(source));
            for (String line: lines) {
                System.out.println(line.replaceAll("[., ]", ""));
            }
        } catch (Exception e) {
            System.out.println("Something went wrong:");
            e.printStackTrace();
        }
    }
}

