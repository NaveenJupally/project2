package com.pet;

import java.util.Scanner;

public class Catalog {

    public static Scanner scanner=new Scanner(System.in);

    public static void chooseOption(){

            System.out.println("choose Your Pet !");
            System.out.println("1.Fish\nSaltWater,\nFreshwater");
            System.out.println("2.Dogs\nVarious Breeds");
            System.out.println("3.Cats\nVarious Breeds,\nExotic Varieties");
            System.out.println("4.Reptiles\nLizards, Turtles,\nSnakes");
            System.out.println("5.Birds\nExotic Varieties");
            choosePet(scanner.nextInt());

    }

    public static void choosePet(int choice){
        switch (choice){
            case 1:
                Pets.chooseFishOption();
                break;
            case 2:
                Pets.chooseDogOption();
                break;
            case 3:
                Pets.chooseCatOption();
                break;
            case 4:
                Pets.chooseReptailOption();
                break;
            case 5:
                Pets.chooseBirdOption();
                break;
        }
    }
}
