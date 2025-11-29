import java.util.Arrays;
class Solution_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  //sorting the array so that similar elements occur adjacent to each other

        int element=nums[0], count=1, maxCount=0; //element will store the majority element. nums[0] is a dummy value for now. count will store the frequency. count is set at 1 to include element at index 0. maxCount will store the frequency of most occuring element. 

        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1])
           count++;     
           else{  //this will work for all kinds of elements except the last one
            if(count>maxCount){
            maxCount=count;
            element=nums[i-1];}
            count=1;
           }                    
        }

        //we will check one more time in case the last element is the majority element
        if(count>maxCount){ 
            maxCount=count; 
            element=nums[nums.length-1];}

        return element;

    }
}