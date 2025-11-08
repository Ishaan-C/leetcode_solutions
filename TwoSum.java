class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m=0,n=0;
        boolean fl=false;
        outer: for(int i=0;i<nums.length;i++){
           inner: for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                m=i;
                n=j;
                fl=true;
                break outer;
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