package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String destination = scanner.nextLine();

        try (InputStream input = Files.newInputStream(Path.of(source));
             OutputStream output = Files.newOutputStream(Path.of(destination))) {
            byte[] buffer = new byte[2];
            while (input.available() > 0) {
                int real = input.read(buffer);
                if (real % 2 == 0) {
                    byte temp = buffer[0];
                    buffer[0] = buffer[1];
                    buffer[1] = temp;
                }
                output.write(buffer, 0, real);
            }
        }
    }
}

