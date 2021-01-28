package com.tts;

public class MagicCalculator extends Calculator {

    public static double Sqrt(int a) {
        return Math.sqrt(a);
    }

    public static double Sin(int a) {
        return Math.sin(a);
    }

    public static double Cosine(int a) {
        return Math.cos(a);
    }

    public static double Tangent(int a) {
        return Math.tan(a);
    }

    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

}
