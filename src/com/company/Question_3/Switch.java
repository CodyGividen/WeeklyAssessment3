package com.company.Question_3;

import java.util.Scanner;

public class Switch {

    private Scanner input = new Scanner(System.in);

    public void switchThing(){
        System.out.println("Select a number 1 to 4. ");
        switch (input.nextInt()) {
            case 1:
                System.out.println("You picked 1!!!");
                switchThing();
                break;
            case 2:
                System.out.println("You picked 2!!!");
                switchThing();

                break;
            case 3:
                System.out.println("You picked 3!!!");
                switchThing();

                break;
            case 4:
                System.out.println("You picked 4!!!");
                switchThing();
                break;
            default:
                input.nextLine();
                System.out.println("Please enter a number between 1 and 4.");
                switchThing();
                break;

        }
    }
}
