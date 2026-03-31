public class RocketLaunchCounter {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
       int launchCount=sc.nextInt();

       while(launchCount > 0){
           System.out.println(launchCount--);
       }
   }
}
