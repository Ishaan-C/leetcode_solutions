class AddDigits_Solution {
    public int addDigits(int num) {

        int sum=0;
        int d=0;

        while(num>0){
            d=num%10;
            sum+=d;
            num/=10;
        }  //This will return the sum of all digits for every number passed

        if(sum>=10) //This will assess if the recursion stops or continues
            return addDigits(sum);
        else
            return(sum);
        
    }
}