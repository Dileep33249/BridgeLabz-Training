import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
         int amarHeight = sc.nextInt();

         int akbarAge = sc.nextInt();
        int akbarHeight = sc.nextInt();

           int anthonyAge = sc.nextInt();
        int anthonyHeight = sc.nextInt();

             if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest with age " + amarAge);
         } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest with age " + akbarAge);
          } else {
            System.out.println("Anthony is the youngest with age " + anthonyAge);
         }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest with height " + amarHeight);
          } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest with height " + akbarHeight);
         } else {
            System.out.println("Anthony is the tallest with height " + anthonyHeight);
         }
    }
}
