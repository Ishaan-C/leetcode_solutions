class MoveZeroes_Solution {
    public void moveZeroes(int[] nums) {

        int temp=0;

        for(int i=0, j=0;i<nums.length && j<nums.length;){
            if(nums[j]!=0){  //we want nums[j] to only store 0 while nums[i] stores non zero numbers
                j++;
                continue;
            }
            //the following part runs only when nums[j]=0

            if(nums[i]!=0 && j<=i){   //swap only when 0 is before a non-zero number (because we are pushing it ahead)
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
        
    }
}
