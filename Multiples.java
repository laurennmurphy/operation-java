/*Project Euler.net
*Multiples of 3 and 5
*Problem 1: Find the sum of all the multiples of 3 or 5 below 1000
*/

public class Multiples {

  public static void main(String[] args) {

    int[] anArray = new int[1000];
    int sum = 0;
    for (int i = 1; i < anArray.length; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
