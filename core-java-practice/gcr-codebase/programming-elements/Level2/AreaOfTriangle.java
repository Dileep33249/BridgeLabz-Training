package Level2;
import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double base=sc.nextDouble();
        double height=sc.nextDouble();

        double area=0.5*base*height;
        System.out.println("The Area of the triangle in sq in is " + area/6.4516 + " and sq cm is " + area);
        
    }
}
