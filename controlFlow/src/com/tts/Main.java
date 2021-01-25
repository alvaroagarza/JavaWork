package com.tts;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static int random1 = (int) (Math.random() * 10);
    public static int random2 = (int) (Math.random() * 10);
    public static int random3 = (int) (Math.random() * 10);

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        AsciiChars.printNumbers();
//        AsciiChars.printLowerCase();
//        AsciiChars.printUpperCase();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);


        System.out.println("Do you wish to continue? (y/n):");
        String answer = scanner.next();

        if (answer.equals("y") || answer.equals("yes")) {
            Questions();
            System.out.println("Would you like to go again?");
            answer = scanner.next();
            if (answer.equals("y") || answer.equals("yes")) {
                Questions();
            } else {
                System.out.println("Understandable, have a nice day.");
            }
        }
        else{
                System.out.println("Please return later to complete the survey.");
            }



    }

    public static void Questions(){

        Scanner scanner = new Scanner(System.in);

            String petName;
            int petAge;
            int luckyNum;
            int qbNum;
            int carYear;
            String favAct;
            int randNum;

            do {
                System.out.println("What is the name of your favorite pet?:");
                petName = scanner.next();

            } while (petName.isEmpty());

            do {
                System.out.println("What is their age?:");
                petAge = scanner.nextInt();

            } while (petAge == 0);

            do {
                System.out.println("What is your lucky number?:");
                luckyNum = scanner.nextInt();

            } while (luckyNum == 0);

            do {
                System.out.println("What is your favorite quarterback's number?:");
                qbNum = scanner.nextInt();

            } while (qbNum == 0);

            do {
                System.out.println("What is the two digit model year of your car?:");
                carYear = scanner.nextInt();

            } while (carYear == 0);

            do {
                System.out.println("What is the first name of your favorite actor/actress?:");
                favAct = scanner.next();

            } while (favAct.isEmpty());

            do {
                System.out.println("Finally, a random number between 1 and 50:");
                randNum = scanner.nextInt();

            } while (randNum == 0);


            String lottoNumbers = lottoGen(luckyNum, carYear, petAge, qbNum, randNum, favAct);
            int magicBall = MagicBall(qbNum);

            System.out.println("Lottery numbers: " + lottoNumbers + " Magic ball: " + magicBall);


        }




    public static int MagicBall (int num) {
        num = num * random1;
        if (num > 75) {
            num -= 75;
        }


        return num;
    }

    public static String lottoGen(int num1, int num2, int num3, int num4, int num5, String str ) {
        String result = "";
        int[] numbers ={0,0,0,0,0};
        int letter = str.charAt(0);
        numbers[0] = num1 + num2;
        numbers[1] = num3 + random2;
        numbers[2] = 42;
        numbers[3] =  num4 + random3 + num5;
        numbers[4] = (letter * random1) / 10;


        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 66) {
                System.out.println(numbers[i]);
                numbers[i] -=65;
            }
            if (i < numbers.length - 1) {
                result += numbers[i] + ", ";

            } else result += numbers[i];

        }



        return result;
    }
}
