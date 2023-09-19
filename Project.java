import java.util.Scanner;
import java.util.Random;
public class Project
{
    public static void main(String[] args)
    {
        System.out.println("Do you want a rigged coin flip or fair one?");
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        if (res.equals("rigged"))
        {
            System.out.println("Coins will be rigged.");
        }
        else
        {
            System.out.println("Coins will be fair.");
        }
        System.out.println("Heads or tails?");
        String answer = s.nextLine();
        s.close();
        Coin coin = new Coin();
        coin.rigged_flip();


    }
}
