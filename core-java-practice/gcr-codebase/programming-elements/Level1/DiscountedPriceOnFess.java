package Level1;
import java.util.*;
public class DiscountedPriceOnFess{
    public static void main(String[] args){
        
        double Fee=125000.0;

        int discountPercentage=10;

        double discount=(Fee * discountPercentage)/100;

        double discountedFee=Fee - discount;

        System.out.println("The discount amount is INR"+ discount+ " and final discounted fee is INR"+discountedFee);
    }
}