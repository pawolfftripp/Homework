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

        for (int i = 0; i < 5 ;i++) {
            System.out.print("Please enter a number: ");
            String addNumber = userInput.nextLine();
            int my_num = Integer.parseInt(addNumber);
            numberArray.add(my_num);
        }
//Finds the sum, product, largest, and smallest of those numbers


        System.out.println(numberArray.get(0));
        System.out.println(numberArray.get(1));


        HashMap<String, String> vehicleInv = new HashMap<String, String>();

        vehicleInv.put("Mazda", "Miata");
        vehicleInv.put("Volkswagen", "GTI");
        vehicleInv.put("Audi", "S3" );
        vehicleInv.put("Honda", "Civic");
        vehicleInv.put("Subaru", "WRX");

    }
}
