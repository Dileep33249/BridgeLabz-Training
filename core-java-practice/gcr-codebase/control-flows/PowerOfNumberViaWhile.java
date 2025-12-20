import java.util.*;
public class PowerOfNumberViaWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base and exponent ");
          int base=sc.nextInt();
        int power=sc.nextInt();

        int result=1;
        int count=1;

        while(count <=power){
            result *= base;
            count++;
        }
        System.out.println("Answer of the calculation is " + result);
    }
}
