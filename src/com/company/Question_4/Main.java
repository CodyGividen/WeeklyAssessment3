package com.company.Question_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
            String color;
            String length;
            String cm;
            String in;
            String thickness;
            String age;





            System.out.println("Type in what ever color you want.");
            color = input.nextLine();
            System.out.println("Type in what ever length you want.");
            length = input.nextLine();
            System.out.println("Type in what ever number you want to equal your centimeters.");
            cm = input.nextLine();
            System.out.println("Type in what ever number you want to equal your inches.");
            in = input.nextLine();
            System.out.println("Type in what ever number you want to equal your thickness.");
            thickness = input.nextLine();
            System.out.println("Type in your age.");
            age = input.nextLine();

            List<String> arrayList = new ArrayList();
            arrayList.add(color);
            //System.out.println("\n");
            arrayList.add(length);
            //System.out.println("\n");
            arrayList.add(cm);
            //System.out.println("\n");
            arrayList.add(in);
            //System.out.println("\n");
            arrayList.add(thickness);
            //System.out.println("\n");
            arrayList.add(age);
            //System.out.println("\n");

            System.out.println("I know I am sorry, I know I am demanding. \n But you are almost done!! \n lol");
            System.out.println("Type in the number 1!!!!");


            switch (input.nextInt()) {
                case 1:
                    System.out.println(arrayList);

                    // was not sure how to do the foreach loop with the array list but i got it to print out the arraylist.
                    break;
                default:
                    System.out.println("Really!!!! Come on type in the number 1!!");
                    //Main main = new Main;
                   // Main();
                    break;


            }

    }
}
