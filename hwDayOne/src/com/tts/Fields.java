package com.tts;

public class Fields {
    static int firstInt = 42;
    static boolean _truthValue;


    public static void main(String[] args) {
        double first_double = 2.98097;

        String FIRST_STRING = "This is a string of characters!";

        System.out.println(firstInt);
        System.out.println((int)first_double);
        System.out.println(FIRST_STRING.length() * firstInt);
        System.out.println(_truthValue);

    }

}
