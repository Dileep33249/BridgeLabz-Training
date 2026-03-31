package Level1;
import java.util.Scanner;
public class CentimeterToFeetAndInches {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);

        double centimeter=sc.nextDouble();
          
        double foot= centimeter / 30;
        double inches=(centimeter % 30) / 2.5;

        System.out.println("Your Height in cm is "+ centimeter+" while in feet is "+ foot+" and inches is "+ inches);
    }
}
