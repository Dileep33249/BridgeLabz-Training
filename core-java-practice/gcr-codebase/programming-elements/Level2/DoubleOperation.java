package Level2;
import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a=sc.nextDouble();
         double b= sc.nextDouble();
        double c= sc.nextDouble();

        double result1 = a + b * c;

        double result2 = a * b + c;

         double result3 = c + a / b;

          double result4 = a % b + c;   
        System.out.println("FirstResult is "+ result1);
         System.out.println("Second Result is " + result2);
          System.out.println("Third Result is" + result3);
             System.out.println("Fourth Result is" + result4);
    }
}
