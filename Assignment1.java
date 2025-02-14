// Import libraries here

import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {

    //***********************************************************************************
    // Step 1: Write initials in block letters **Come Back Too**
    System.out.println("KK   KKK         CCC");
    System.out.println("KK  KK        CCCCCCCC");
    System.out.println("KK KK        CCCC");
    System.out.println("KKKK        CCC");
    System.out.println("KK KK        CCCC");
    System.out.println("KK  KK        CCCCCCCC");
    System.out.println("KK   KKK        CCC");




    //************************************************************************************
    //Step 2: Convert Fahrenheite to Celsius
    final int BASE = 32;
    final double CONVERSTION_FACTOR = 5.0 / 9.0;

    double CelsiusTemp;
    int FahrenheiteTemp = 32;                                    //Value to Convert

    CelsiusTemp = CONVERSTION_FACTOR * (FahrenheiteTemp - BASE);

    //************************************************************************************
    //Step 3: Reverse a five character string without the first and last characters
    String phrase = "zderx";
    String mutation1, mutation2, mutation3, mutation4, mutation5;
    
    mutation1 = phrase.substring( 1, 4);     //Deleting the first and last character of the phrase
    mutation2 = mutation1.replace('r', 'd' ) ;   //Replacing 'r' with'd' to read 'ded'
    mutation3 = mutation2.substring(1, 3);   //Creating a substring to read 'ed'
    mutation4 = mutation1.substring(2,3);    //Creating another substring to read 'r'
    mutation5 = mutation4.concat(mutation3);                     //Concacting mutation 4 and 3 to read 'red'

    //**************************************************************************************
    //Step 4: generate and save a random number between 32 – 16,384, inclusive
    Random genorator = new Random();
    int num1;

    num1 = genorator.nextInt(32, 16384);

    //***************************************************************************************
    //Step5: Print results
    System.out.println("Please enter a number in Fahrenheit:");
    System.out.println("32");

    System.out.println();

    System.out.println("PLease enter a 5-character string:");
    System.out.println("zderx");

    System.out.println();

    System.out.println("Generating random number. Continuing...");

    System.out.println();

    System.out.println("Your new string is " + CelsiusTemp + mutation5 + num1);

  }
}
