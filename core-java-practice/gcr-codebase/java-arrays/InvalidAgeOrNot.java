public class InvalidAgeOrNot {
    public static void main(String[] args){
        int [] ageArray=new int[10];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<ageArray.length;i++){
            ageArray[i]=sc.nextInt();
        }

        for(int i=0;i<ageArray.length;i++){
            if(ageArray[i] < 0){
                System.out.println("Invalid Age" +ageArray[i]);
            }
            else if(ageArray[i] < 18){
                System.out.println("Person is With "+ageArray[i]+"Not Allowed to vote");
            }
            else{
                System.out.println("person with "+ ageArray[i]+" can vote");
            }
        }
    }
}
