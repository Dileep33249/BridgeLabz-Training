import java.util.*;
public class DiscountedCoursePrice{
    public static void main(String[] args){
        
        int fees=125000;
        int discountPercent=10;

        int discount=fees * 10 / 100;
        int discountedFees=125000 - discount;

        System.out.println("The fees has to pay after discount is +" + discountedFees);

    }
}