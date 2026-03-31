package Level1;
import java.util.*;
public class DiscountedPriceOnFees{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        
        double Fee=sc.nextDouble();

        int discountPercentage=10;

        double discount=(Fee * discountPercentage)/100;

        double discountedFee=Fee - discount;

        System.out.println("The discount amount is INR"+ discount+ " and final discounted fee is INR"+discountedFee);
    }
}