package Level1;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int area=(base*height)/2;
        System.out.println("The Area of the triangle in sq in is " + area/6.4516 + " and sq cm is " + area);
    }
}
