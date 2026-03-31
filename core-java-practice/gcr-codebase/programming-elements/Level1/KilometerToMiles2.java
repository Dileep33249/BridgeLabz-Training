package Level1;
import java.util.*;
public class KilometerToMiles2{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        double km=sc.nextInt();
        double miles=km * 0.621371;

        System.out.println(km + " kilometers is equal to " + miles + " miles.");
    }
}