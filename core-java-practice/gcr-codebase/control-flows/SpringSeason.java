public class SpringSeason {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); 
        int month=scanner.nextInt(); 

    if((month==3 && day >=20) || (month==4 && day >=20) || (month==5 && day >=20) || (month==6 && day <=20)){
            System.out.println("It's Spring Season");
        }
        else{
            System.out.println("It's not Spring Season");
        }
    }
}
