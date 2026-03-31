package Level1;
import java.util.Scanner;
public class MaximumHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();

          int handshakes = (numOfStudents*(numOfStudents-1))/2;

        System.out.println("Maximum number of handshakes possible is " + handshakes);
    }
}
