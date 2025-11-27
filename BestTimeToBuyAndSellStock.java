class Solution {
    public int maxProfit(int[] prices) {

        //NEW ALGORITHM-
        //1. Find minimum price so far
        //2. Subtract current price-minimum price to obtain profit
        //3. Return only max profit

        int minPrice=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){  //starting from 2nd element because buying and selling on the first day itself is meaningless
            if(prices[i]<minPrice)
                minPrice=prices[i];

            if(profit<(prices[i]-minPrice))
                profit=prices[i]-minPrice;
        }

        return profit;





        /*THIS WAS MY ORIGINAL IDEA
        int profit=0; // This will store the profit between 2 different days
        for(int i=0;i<prices.length-1;i++){  //i is going to access variables from 0 to the 2nd last element
            for(int j=i+1;j<prices.length;j++){ //j is going to access variables from the next day onwards up till the last element
                if(prices[j]-prices[i]>profit){ //selling price-buying price
                    profit=prices[j]-prices[i];
                }
                
            }
        }
        if(profit>0)
        return profit;  //return profit only when a profit has been made
        else
        return 0;  //else return 0 

        //This logic is essentially correct and would work. However, it exceeded the time limit on LeetCode.
    */
    }
}