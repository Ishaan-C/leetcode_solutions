public class PlusOne{
    public int[] plusOne(int[] digits){

        //SPECIAL CASE- all 9's
        boolean allNine = true;

        for (int digit : digits) {
             if (digit != 9) {
             allNine = false;
             break; // no need to check further
    }
}

        if (allNine) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        } 



        //GENERAL CASE
        for(int i=digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;  //return early as the digit has already been incremented
            }        
                digits[i] = 0;   // digit has to be 9 so turn 9 into 0 and continue carrying 1 to the left

             }
             return digits; // this line should be unreachable due to the allNine case handled above
        }
    }
    //RUNTIME- 0ms. BEATS 100%.


