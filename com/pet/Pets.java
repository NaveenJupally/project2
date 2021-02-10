package com.pet;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Pets {

    public static Scanner scanner=new Scanner(System.in);

    //Fish
    public static void chooseFishOption(){
        System.out.println("Fish");
        System.out.println("ProductionID  Name");
        System.out.println("1.FI-SW-01    Angelfish");
        System.out.println("2.FI-SW-02    Tiger Shark");
        System.out.println("3.FI-FW-01    Koi");
        System.out.println("4.FI-FW-02    Goldfish");
        chooseFish(scanner.nextInt());
    }
    public static void chooseFish(int choice){

        switch (choice) {
            case 1:
                angelFish();
                break;
            case 2:
                tigerShark();
                break;
            case 3:
                koi();
                break;
            case 4:
                goldFish();
                break;
        }
    }

    public static void angelFish(){

        System.out.println("\t\t\t\tAngelfish");
        System.out.println("  ItemID  ProductID  Description       ListPrice");
        System.out.println("1.EST-1   FI-SW-01   Large Angelfish   $16.50      Add to Cart");
        System.out.println("2.EST-2   FI-SW-01   Small Angelfish   $16.50      Add to Cart");
        int user=scanner.nextInt();
        switch (user){
            case 1:
                System.out.println("\t\t\t\tSalt Water fish from Australia\nEST-1\nLarge Angelfish\nAngelfish\n9888 in stock.\n$16.50\nAdd to Cart");
                break;
            case 2:
                System.out.println("\t\t\t\tSalt Water fish from Australia\nEST-2\nSmall Angelfish\nAngelfish\n9992 in stock.\n$16.50\nAdd to Cart");
                break;
        }
    }

    public static void tigerShark(){
        System.out.println("\t\t\t\tTiger Shark");
        System.out.println("  ItemID  ProductID  Description               ListPrice");
        System.out.println("1.EST-3   FI-SW-02   Toothless Tiger Shark     $18.50      Add to Cart");
        int user=scanner.nextInt();
        switch (user) {
            case 1:
                System.out.println("\t\t\t\tSalt Water fish from Australia\nEST-3\nToothless Tiger Shark\nTiger Shark\n9983 in stock.\n$18.50\nAdd to Cart");
                break;
        }
    }
    public static void koi(){

        System.out.println("\t\t\t\tAngelfish");
        System.out.println("  ItemID  ProductID  Description   ListPrice");
        System.out.println("1.EST-4   FI-FW-01   Spotted Koi   $18.50       Add to Cart");
        System.out.println("2.EST-5   FI-FW-01   Spotless Koi  $18.50       Add to Cart");
        int user=scanner.nextInt();
        switch (user){
            case 1:
                System.out.println("\t\t\t\tFresh Water fish from Japan\nEST-4\nSpotted Koi\nKoi\n9988 in stock.\n$18.50\nAdd to Cart");
                break;
            case 2:
                System.out.println("\t\t\t\tFresh Water fish from Japan\nEST-5\nSpotless Koi\nKoi\n9984 in stock.\n$18.50\nAdd to Cart");
                break;
        }
    }
    public static void goldFish(){

        System.out.println("\t\t\t\tGoldfish");
        System.out.println("  ItemID  ProductID  Description           ListPrice");
        System.out.println("1.EST-20   FI-FW-02  Adult Male Goldfish   $5.50       Add to Cart");
        System.out.println("2.EST-21   FI-FW-02  Adult Female Goldfish $5.29       Add to Cart");
        int user=scanner.nextInt();
        switch (user){
            case 1:
                System.out.println("\t\t\t\tFresh Water fish from China\nEST-20\nAdult Male Goldfish\nGoldfish\n9990 in stock.\n$5.50\nAdd to Cart");
                break;
            case 2:
                System.out.println("\t\t\t\tFresh Water fish from China\nEST-21\nAdult Female Goldfish\nGoldfish\n9988 in stock.\n$5.29\nAdd to Cart");
                break;
        }
    }

    //Dogs
    public static void chooseDogOption(){
        System.out.println("Dogs");
        System.out.println("ProductionID  Name");
        System.out.println("1.K9-BD-01    Bulldog");
        System.out.println("2.K9-PO-02    Poodle");
        System.out.println("3.K9-DL-01    Dalmation");
        System.out.println("4.K9-RT-01    Golden Retriever");
        System.out.println("5.K9-RT-02    Labrador Retriever");
        System.out.println("6.K9-CW-01    Chihuahua");

        chooseDog(scanner.nextInt());
    }


    public static void chooseDog(int choice){

        switch (choice) {
            case 1:
                bullDog();
                break;
            case 2:
                poodle();
                break;
            case 3:
                dalmation();
                break;
            case 4:
                goldenRetriever();
                break;
            case 5:
                labradorRetriever();
                break;
            case 6:
                chihuahua();
                break;
        }
    }

    public static void bullDog(){

        System.out.println("\t\t\t\tBulldog");
        System.out.println("ItemID  ProductID  Description           ListPrice");
        System.out.println("EST-6   K9-BD-01   Male Adult Bulldog    $18.50       Add to Cart");
        System.out.println("EST-7   K9-BD-01   Female Puppy Bulldog  $18.50       Add to Cart");
        int user=scanner.nextInt();
        switch (user){
            case 1:
                System.out.println("\t\t\t\tFriendly dog from England\nEST-6\nMale Adult Bulldog\nBulldog\n9968 in stock.\n$18.50\nAdd to Cart");
                break;
            case 2:
                System.out.println("\t\t\t\tFriendly dog from England\nEST-7\nFemale Puppy Bulldog\nBulldog\n9993 in stock.\n$18.50\nAdd to Cart");
                break;
        }
    }

    public static void poodle(){
        System.out.println("\t\t\t\tPoodle");
        System.out.println("ItemID  ProductID  Description           ListPrice");
        System.out.println("EST-8   K9-PO-02   Male Puppy Poodle     $18.50       Add to Cart");
    }
    public static void dalmation(){

        System.out.println("\t\t\t\tDalmation");
        System.out.println("ItemID  ProductID  Description                     ListPrice");
        System.out.println("EST-9   K9-DL-01   Spotless Male Puppy Dalmation   $18.50       Add to Cart");
        System.out.println("EST-10  K9-DL-01   Spotted Adult Female Dalmation  $18.50       Add to Cart");
    }
    public static void goldenRetriever(){

        System.out.println("\t\t\t\tGolden Retriever");
        System.out.println("ItemID  ProductID  Description                      ListPrice");
        System.out.println("EST-28  K9-RT-01   Adult Female Golden Retriever    $155.29       Add to Cart");

    }
    public static void labradorRetriever(){

        System.out.println("\t\t\t\tLabrador Retriever");
        System.out.println("ItemID  ProductID  Description                      ListPrice");
        System.out.println("EST-22  K9-RT-02   Adult Male Labrador Retriever    $135.50       Add to Cart");
        System.out.println("EST-23  K9-RT-02   Adult Female Labrador Retriever  $145.49       Add to Cart");
        System.out.println("EST-24  K9-RT-02   Adult Male Labrador Retriever    $255.50       Add to Cart");
        System.out.println("EST-25  K9-RT-02   Adult Female Labrador Retriever  $325.29       Add to Cart");
    }
    public static void chihuahua(){

        System.out.println("\t\t\t\tChihuahua");
        System.out.println("ItemID  ProductID  Description             ListPrice");
        System.out.println("EST-26  K9-CW-01   Adult Male Chihuahua    $125.50      Add to Cart");
        System.out.println("EST-27  K9-CW-01   Adult Female Chihuahua  $155.29      Add to Cart");

    }

    //Cats
    public static void chooseReptailOption(){
        System.out.println("Reptailes");
        System.out.println("ProductionID  Name");
        System.out.println("1.RP-SN-01    Rattlesnake");
        System.out.println("2.RP-LI-02    Iguana");
        chooseReptail(scanner.nextInt());
    }
    public static void chooseReptail(int choice){

        switch (choice) {
            case 1:
                rattlesnake();
                break;
            case 2:
                iguana();
                break;
        }
    }

    public static void rattlesnake(){

        System.out.println("\t\t\t\tRattlesnake");
        System.out.println("ItemID  ProductID  Description             ListPrice");
        System.out.println("EST-11  RP-SN-01   Venomless Rattlesnake   $18.50      Add to Cart");
        System.out.println("EST-12  RP-SN-01   Rattleless Rattlesnake  $18.50      Add to Cart");
    }

    public static void iguana(){
        System.out.println("\t\t\t\tPersian");
        System.out.println("ItemID  ProductID  Description         ListPrice");
        System.out.println("EST-13  RP-LI-02   Green Adult Iguana  $18.50       Add to Cart");

    }

    //Reptiles
    public static void chooseCatOption(){
        System.out.println("Cats");
        System.out.println("ProductionID  Name");
        System.out.println("1.FL-DSH-01   Manx");
        System.out.println("2.FL-DSH-02   Persian");
        chooseCat(scanner.nextInt());
    }
    public static void chooseCat(int choice){

        switch (choice) {
            case 1:
                manx();
                break;
            case 2:
                persian();
                break;
        }
    }

    public static void manx(){

        System.out.println("\t\t\t\tManx");
        System.out.println("ItemID  ProductID  Description    ListPrice");
        System.out.println("EST-14  FL-DSH-01  Tailless Manx  $58.50      Add to Cart");
        System.out.println("EST-15  FL-DSH-01  Tail Manx      $23.50      Add to Cart");
    }

    public static void persian(){
        System.out.println("\t\t\t\tPersian");
        System.out.println("ItemID  ProductID  Description           ListPrice");
        System.out.println("EST-16  FL-DLH-02  Adult Female Persian  $93.50      Add to Cart");
        System.out.println("EST-17  FL-DLH-02  Adult Male Persian    $93.50      Add to Cart");
    }


    //Birds
    public static void chooseBirdOption(){
        System.out.println("Birds");
        System.out.println("ProductionID  Name");
        System.out.println("1.AV-CB-01    Amazon Parrot");
        System.out.println("2.AV-SB-02    Finch");
        chooseBird(scanner.nextInt());
    }
    public static void chooseBird(int choice){

        switch (choice) {
            case 1:
                amazonParrot();
                break;
            case 2:
                Finch();
                break;
        }
    }

    public static void amazonParrot(){

        System.out.println("\t\t\t\tAmazon Parrot");
        System.out.println("ItemID  ProductID  Description               ListPrice");
        System.out.println("EST-18  AV-CB-01   Adult Male Amazon Parrot  $193.50     Add to Cart");
    }

    public static void Finch(){
        System.out.println("\t\t\t\tFinch");
        System.out.println("ItemID  ProductID  Description               ListPrice");
        System.out.println("EST-19  AV-SB-02   Adult Male Finch          $15.50     Add to Cart");
    }


}
