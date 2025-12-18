package Level1;
import java.util.Scanner;
public class VolumeOfEarth {
    public static void main(String[] args) {

        

        double radius=6378.0;

        double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.println("The volume of earth in cubic kilometers is "+ volume + " km³ and cubic miles is "+ (volume * 0.23991) + " mi³");
    }
}