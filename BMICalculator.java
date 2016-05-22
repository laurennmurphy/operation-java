// Create a BMI Calculator in java. By Lauren Murphy

import java.util.Scanner;
import java.math.*;

public class BMICalculator{

  // Create variables for user questions
  private static BigDecimal heightFeet, heightInches, weight;

  public static void userQuestions(){
    Scanner number = new Scanner(System.in);

    System.out.println("What is your height?(feet only)");
    heightFeet = number.nextBigDecimal();

    System.out.println("What is your height?(inches)");
    heightInches = number.nextBigDecimal();

    System.out.println("What is your weight in pounds?");
    weight = number.nextBigDecimal();
  }

  // Create variables for the calculations
  private static BigDecimal convertToInches, height, squaredHeight, weightByHeight;

  public static void convertHeight(){
    // Convert heightFeet to height in inches
    convertToInches = new BigDecimal("12");
    // Create variable for height
    height = heightFeet;
    // Multiply by heightFeet by 12
    height = height.multiply(convertToInches);
    // Add height to heightInches
    height = height.add(heightInches);
    System.out.println("Height is " + height + " inches.");
  }

  public static void squareHeight(){
    // Square the entire height in inches
    squaredHeight = height;
    squaredHeight = squaredHeight.multiply(height);
  }

  public static void userWeightByHeight(){
    // Divide your weight in pounds by height in inches squared
    weightByHeight = weight;
    // Use MathContext to round off division result
    MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
    weightByHeight = weightByHeight.divide(squaredHeight,mc);
  }

  public static void calculateResult(){
    //Multiply the answer by conversion factor 703; use when meters and kilograms aren't being measured
    BigDecimal conversionNum = new BigDecimal("703");
    BigDecimal result = weightByHeight;
    result = result.multiply(conversionNum).setScale(2, BigDecimal.ROUND_HALF_UP);

    System.out.println("BMI is " + result);
  }

  public static void main(String[] args){
    userQuestions();
    convertHeight();
    squareHeight();
    userWeightByHeight();
    calculateResult();
  }
}