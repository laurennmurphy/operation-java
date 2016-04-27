import java.util.Random;
import java.util.Scanner;

/* Create a Magic Eight Ball in java that answers questions from the user.
* By Lauren Murphy
*/
public class MagicEightBall{

  public static void askQuestion(){
    System.out.println("Magic 8-Ball: Please ask a yes or no question");
    Scanner scan = new Scanner(System.in);
    String userInput = scan.nextLine();
  }

  public static void allResponses(){
    // Declare a random object
    Random num = new Random();

    // Declare an int for the 20 choices
    int choice = 1 + num.nextInt(20);

    // Create an empty string for the answer
    String answer = "";

    switch(choice){
      case 1: answer = "Yes";
              break;
      case 2: answer = "No";
              break;
      case 3: answer = "Outlook not so good";
              break;
      case 4: answer = "Absolutely";
              break;
      case 5: answer = "Ask again later";
              break;
      case 6: answer = "Never";
              break;
      case 7: answer = "Maybe";
              break;
      case 8: answer = "Better luck next time";
              break;
      case 9: answer = "No Way!";
              break;
      case 10: answer = "It is certain";
              break;
      case 11: answer = "Signs point to yes";
              break;
      case 12: answer = "Don't count on it";
              break;
      case 13: answer = "As I see it, yes";
              break;
      case 14: answer = "Very doubtful";
              break;
      case 15: answer = "Most likely";
              break;
      case 16: answer = "Without a doubt";
              break;
      case 17: answer = "My reply is no";
              break;
      case 18: answer = "Better luck next time";
              break;
      case 19: answer = "My sources say no";
              break;
      case 20: answer = "You may rely on it";
              break;
      default: answer = "Uh oh, Something went wrong!";
              break;
      }
      System.out.println("Magic 8-Ball Response: " + answer);
  }
  public static void main(String[] args){
    askQuestion();
    allResponses();
  }
}