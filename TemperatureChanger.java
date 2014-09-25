/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
String user = "";

System.out.println("Input a temperature value and either an F or a C,  Fahrenheit or Celsuis  ");
user = input.nextLine();

String value= user.substring(user.length()-1, user.length());
String strnum= user.substring(0, user.length() - 1);



double num = Double.parseDouble(strnum);
 

if (value.equals("F")){
System.out.println((num-32) * 5 / 9 );
}
else if (value.equals("C")){
System.out.println(num * 9 / 5 + 32);
}
else{
System.out.println("There was a problem, Re-Run, make sure you print and integer value then either F or C");
}

//System.out.println(num + value);
 // TODO - scan for input in the format 175F or 18C 
    // TODO - perform correct conversion
    // TODO - print out results to the screen
  }
  
}


