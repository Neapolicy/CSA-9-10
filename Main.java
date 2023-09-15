import java.util.Scanner;
public class Main
{
  public static void main(String[]arge)
  {
    System.out.println("Hello, world.");
    System.out.println("This took way longer than needed."); // 1.1
    int i = 17;
    final double n = 3.10;
    boolean b = true;
    System.out.println(i);
    System.out.println(n);
    System.out.println(b); // 1.2
    System.out.println(i + 17);
    System.out.println(n - 3.4);
    System.out.println(n + 23 / n * 2); // 1.3
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    s.close();
     try {
      System.out.print(num1/num2);
  }
    catch (ArithmeticException e){
      System.out.println("exception found");
    }
    num1 += 1;
    --num2; 
    System.out.println(num1);
    System.out.println(num2); //1.4 + 1.3 challenge
    System.out.println((int)n); // 1.5
}
}