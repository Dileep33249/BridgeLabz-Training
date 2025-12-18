package Level2;
import java.util.*;
public class ParameterOfSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int parameter=sc.nextInt();
        int sideLength=parameter/4;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + parameter);

    }
}
