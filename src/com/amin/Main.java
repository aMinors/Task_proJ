package com.amin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create an  object
        ArrayList<String> ToDo = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // Create an Aobject//


        //strings
        String task;
        String answeryn;
       //Strings//

//intro
        System.out.println("Olaa :) Let's create your list! ");
        System.out.println("Please enter your  task:");
        task = scan.nextLine();
        ToDo.add(task);
//intro//

        //Logic
        do {
            System.out.println("Would you like to Add? y/n");
            answeryn = scan.nextLine();
            System.out.println(answeryn);

            if (!answeryn.equals("y"));

            {  System.out.println("Add your task(s):");
                task = scan.nextLine();//Add the input to the list
                ToDo.add(task);
                System.out.println(task);//Tasks on the list
            }
        }
        while (!answeryn.equals("n"));

        System.out.println(ToDo);  // print out ToDo_List
        System.out.println("See you next time!");
        return;
//Logic//
    }
}

