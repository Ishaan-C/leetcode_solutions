public class Median_Array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int c[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            c[i]=nums1[i];
        }
        
        for(int i=0;i<nums2.length;i++){
            c[nums1.length+i]=nums2[i];
        }      //merging is finished

        // Bubble sort implementation based on standard algorithm concepts

        for(int i=0;i<c.length-1;i++){
            for(int j=0;j<c.length-i-1;j++){
                if(c[j]>c[j+1]){
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }



        if(c.length%2==0){
            int mid=c.length/2;
            return (c[mid]+c[mid-1])/2.0;  
        }
        else{
            int mid=c.length/2;
            return c[mid];
        }
        //determining median based on even or odd length of array
}
}
