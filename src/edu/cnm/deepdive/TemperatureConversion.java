package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {
    if (args.length == 0) {
      double c = 100;
      double f = 32;
      System.out.println("Celsius " + c + " = " + convertC2F(c) + " Fahrenheit");
      System.out.println("Fahrenheit " + f + " = " + convertF2C(f) + " Celsius");
    } else {
      for (String arg : args) {
        double c = Double.parseDouble(arg);
        System.out.println("Celsius " + c + " = " + convertC2F(c) + " Fahrenheit");
      }
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
