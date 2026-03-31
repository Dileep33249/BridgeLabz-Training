class Solution {
    public int[] plusOne(int[] digits) {
       
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        }
         if(digits.length ==1){
            return new int[]{1,0};
        }


        List<Integer> arr=new ArrayList<>();
        int carry=0;
        for(int i=digits.length-1;i >=0;i--){
            if(i==digits.length-1){
                if(digits[i]==9){
                    arr.add(0);
                    carry=1;
            }
            }
               else if(digits[i]==9 && carry==1){
                    int t=digits[i];
                    arr.add(0);
                    carry=1;
                 }
                 else{
                    arr.add(digits[i]+carry);
                    carry=0;
                 }
        }
        if(carry==1){
            arr.add(carry);
        }
        int [] ans=new int[arr.size()];
        int idx=arr.size()-1;
        for(int i=0;i<arr.size();i++){
             ans[i]=arr.get(idx);
             idx--;
        }
        return ans;
    }
}