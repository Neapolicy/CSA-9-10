import java.util.Scanner;
import java.util.Random;
public class Project
  {
    public static void main(String[] args)
    {
      System.out.println("Do you like to gamble?");
      Scanner s = new Scanner(System.in);
      String name = s.nextLine();
      if (name.equals("yes")){
        System.out.println("good.");
      }else{
          System.out.println("WELL TOO BAD.");
      }
      System.out.println("Heads or tails?");
      String call = s.nextLine();
      System.out.println(call + ", eh?");
      s.close();
      System.out.println();
      Random rand = new Random();
      int rand_int = rand.nextInt(2);
      int numberOfHeads = 0;
      int numberOfTails = 0;
      if (rand_int == 1){
        numberOfHeads += 1;
        System.out.println("heads!");
        if (call.equals("heads")){
          System.out.println("correct!");
        }
        else{
          System.out.println("unlucky!");
        }
      }
      if (rand_int == 0){
        numberOfHeads += 1;
        System.out.println("tails!");
        if (call.equals("tails")){
          System.out.println("correct!");
        }
        else{
          System.out.println("unlucky!");
        }
      }


      final double probabilityOfHeads = 0.5;
      boolean isHeads = true;
      System.out.println("The probability of a fair coin landing on heads is " + probabilityOfHeads + ".");
      System.out.println("The coin has landed heads " + numberOfHeads + " times.");
      System.out.println();
      double proportionOfTails = (int)(numberOfTails/(numberOfTails + numberOfHeads)); //compound expression
      System.out.println("The coin has landed tails " + proportionOfTails * 100 + " percent of the time.");
    }
  }
