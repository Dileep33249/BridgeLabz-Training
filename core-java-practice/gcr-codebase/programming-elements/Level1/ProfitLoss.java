package Level1;
import java.util.*;
public class ProfitLoss{
    public static void main(String [] args){
        int costPrice=129;

        int sellingPrice=191;

        int profit=sellingPrice - costPrice;
        int ProfitPercentage=(profit / costPrice) * 100;

        System.out.println("The cost price is INR" + costPrice + " and sellingPrice is INR + sellingPricemade is: " + profit);
        System.out.println("The profit percentage is: " + ProfitPercentage + "%");
    }
}