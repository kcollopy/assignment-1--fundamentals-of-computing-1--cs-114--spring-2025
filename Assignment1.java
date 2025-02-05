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
    
  }
}
