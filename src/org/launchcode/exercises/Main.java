package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(20, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student: studentFiles.entrySet()) {
            CheckFileExtention(student.getValue());
        }

    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y <= 0) {
            try {
                throw new ArithmeticException("Enter a positive integer for total points possible. Zero cannot be in the denominator");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int score = 0;

        if (fileName.contains(".java")) {
            score = 1;
        }

        if (!fileName.contains(".java")) {
            score = 0;
        }

        if (fileName.isBlank()) {
            try {
                throw new RuntimeException("fileName is either an empty string or null");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            score = -1;
        }
        return score;
    }
}
