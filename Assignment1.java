// Import libraries here

public class Assignment1 {
  public static void main(String[] args) {

    // ***********************************************************************************
    // Step 1: Write initials in block letters **Come Bake Too**
    System.out.println("KC");

    //************************************************************************************
    // Step 2: Convert Fahrenheite to Celsius
    final int base = 32;
    final double conversion_factor = 5.0 / 9.0;

    double CelsiusTemp;
    int FahrenheiteTemp = 32;                                    //Value to Convert

    CelsiusTemp = conversion_factor * (FahrenheiteTemp - base);

    System.out.println("Celsius Temperature: " + CelsiusTemp);

    // ************************************************************************************
    // Step 3: Reverse a five character string without the first and last characters
    String phrase = "zredx";
    String mutation1, mutation2, mutation3, mutation4, mutation5;
    
    mutation1 = phrase.substring( 1, 4);     //Deleting the first and last character of the phrase
    mutation2 = mutation1.replace('r', 'd' ) ;   //Replacing 'r' with'd' to read 'ded'
    mutation3 = mutation2.substring(1, 3);   //Creating a substring to read 'ed'
    mutation4 = mutation1.substring(0,1);    //Creating another substring to read 'r'
    mutation5 = mutation4.concat(mutation3);                     //Concacting mutation 4 and 3 to read 'red'

    System.out.println(mutation5);

    //**************************************************************************************

  }
}
