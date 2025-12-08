import java.util.*;  

class SelfDividingNumbers_Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>(); // create the list to store results

        for(int i = left; i <= right; i++){
            if(selfDividing(i)){
                result.add(i);  // add the number to the list
            }
        }

        return result; // return the final list
    }

    boolean selfDividing(int a){
        int n = a;
        while(a > 0){
            int d = a % 10;
            if(d == 0 || n % d != 0)  //handling edge case when a can be 0
                return false;
            a /= 10;
        }
        return true;
    }
}
