package Level2;
import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
         int b= sc.nextInt();
        int c= sc.nextInt();

        int result1 = a + b * c;

        int result2 = a * b + c;

         int result3 = c + a / b;

          int result4 = a % b + c;

        System.out.println("FirstResult is "+ result1);
         System.out.println("Second Result is " + result2);
          System.out.println("Third Result is" + result3);
             System.out.println("Fourth Result is" + result4);
    }
}
