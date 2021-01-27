package com.tts;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numOfInput = 0;
        Scanner input = new Scanner(System.in);
        List<Integer> userNums = new ArrayList<>();
        HashMap<String, String> dealership = new HashMap<>();
        dealership.put("Civic", "Honda");
        dealership.put("Tacoma", "Toyota");
        dealership.put("F-150", "Ford");
        dealership.put("911", "Ferrari");

        System.out.println(dealership);
        carLookup(dealership);

        while (numOfInput < 5){
            System.out.println("Please enter a number: ");
            userNums.add(input.nextInt());
            numOfInput++;
        }

        arrMani(userNums);
    }


    public static void arrMani(List<Integer> input) {
        int sum = 0;
        int product = 1;
        int largest = 0;
        int smallest = 0;

        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
            product *= input.get(i);
            Collections.sort(input);
            largest = input.get(input.size() - 1);
            smallest = input.get(0);

        }
        System.out.println("Your sum is: " + sum);
        System.out.println("Your product is: " + product);
        System.out.println("The largest number in the list is: " + largest);
        System.out.println("The smallest number in the list is: " + smallest);
    }

    public static void carLookup (HashMap<String, String> input){
        Scanner userInput = new Scanner(System.in);
        String carName = "";
        System.out.println("What car are you looking for?");
        carName = userInput.next();
        String make = "";

        if(input.containsKey(carName)){
            make = input.get(carName);
            System.out.printf("Oh a %s, our %s section is over there", carName, make);
        } else System.out.println("Sorry, we don't sell that car here.");



    }
}


