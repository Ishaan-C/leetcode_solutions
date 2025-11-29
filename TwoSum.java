class Solution_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int m=0,n=0;
        boolean fl=false;
        outer: for(int i=0;i<nums.length;i++){
           inner: for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){ //checking if the sum of an element with consequent elements equals target
                m=i;
                n=j;
                fl=true;
                break outer;  //breaking both loops as soon as we find the first such pair
            }
           }

        }
        if(fl){
            return new int[]{m,n};   
        }
        else{
            return null;
        }
    }
}