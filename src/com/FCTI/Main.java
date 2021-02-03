package com.FCTI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        ArrayList<Integer> numberArray = new ArrayList<Integer>();


        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number: ");
            String addNumber = userInput.nextLine();
            int my_num = Integer.parseInt(addNumber);
            numberArray.add(my_num);
        }

        System.out.println(numberArray);


//SUM
        int sum = 0;

        for (int i : numberArray)
            sum += i;
        System.out.println("The sum is: " + sum);


//PRODUCT
        int product = 1;
        for (int i = 0; i < numberArray.size(); i++) {
            product = product * numberArray.get(i);
//             System.out.println(product);
        }
        System.out.println("The product is: " + product);


//LARGEST
        int max = numberArray.get(0);
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) > max)
                max = numberArray.get(i);
        }
        System.out.println("The largest number is: " + max);


//SMALLEST
        int min = numberArray.get(0);
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) < min)
                min = numberArray.get(i);
        }
        System.out.println("The smallest number is: " + min);

        System.out.println();

        HashMap<String, String> vehicleInv = new HashMap<String, String>();

        vehicleInv.put("Miata", "Mazda");
        vehicleInv.put("GTI", "Volkswagen");
        vehicleInv.put("S3", "Audi");
        vehicleInv.put("Civic", "Honda");
        vehicleInv.put("WRX", "Subaru");

        System.out.println("What vehicle model are you looking for? ");
        String modelRequest = userInput.nextLine();
        if (vehicleInv.containsKey(modelRequest)) ;
        {
            System.out.printf("It appears you are looking for a %s, our %s section is over here...", modelRequest, vehicleInv.get(modelRequest));
        }
    }
}