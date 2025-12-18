package Level1;

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int paraMeter=sc.nextInt();
        int sideLength=paraMeter/4;
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + paraMeter);
    }
}
