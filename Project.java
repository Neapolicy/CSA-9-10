import java.util.Scanner;
import java.util.Random;
public class Project
  {
    public static void main(String[] args)
    {
      System.out.println("Do you like to gamble? (type yes to also stop integer rounding)");
      Scanner s = new Scanner(System.in);
      String res = s.nextLine();
      if (res.equals("yes")){
        System.out.println("good.");
      }else{
          System.out.println("WELL TOO BAD.");
      }
      System.out.println("Heads or tails?");
      String ans = s.nextLine();
      System.out.println(ans + ", eh?");
      s.close();
      System.out.println();
      Random rand = new Random();
      int rand_int = rand.nextInt(2);
      int numberOfHeads = 0;
      int numberOfTails = 0;
      if (rand_int == 1){
        ++numberOfHeads;
        System.out.println("heads!");
        if (ans.equals("heads")){
          System.out.println("correct!");
        }
        else{
          System.out.println("unlucky!");
        }
      }
      if (rand_int == 0){
        numberOfHeads += 1;
        System.out.println("tails!");
        if (ans.equals("tails")){
          System.out.println("correct!");
        }
        else{
          System.out.println("unlucky!");
        }
      }


      final double probabilityOfHeads = 0.5;
      System.out.println("The probability of a fair coin landing on heads is " + probabilityOfHeads + ".");
      System.out.println("The coin has landed heads " + numberOfHeads + " times.");
      System.out.println();
      double proportionOfTails =(numberOfTails/(numberOfTails + numberOfHeads)); //compound expression
      System.out.println("The coin has landed tails " + proportionOfTails * 100 + " percent of the time.");
      
      // checklist dump because I don't know how to incorporate it neatly
      boolean boole = true;
    }
  }

