package com.tts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arrTest = {1, 2, 4, 5, 7, 9};

        System.out.println("Your array sums to: " + arrSum(arrTest));

        System.out.println(Arrays.toString(toPower(4,2)));
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for(int num: arr) {

            sum += num;

        }
        return sum;

    }

    public static Integer[] toPower(int size, int power) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add((int) Math.pow(i , power));
        }


        return result.toArray(new Integer[0]);

    }
}
