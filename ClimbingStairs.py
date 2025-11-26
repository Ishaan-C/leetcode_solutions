class Solution:
    def climbStairs(self, n: int) -> int:

        '''
        This problem can be represented in terms of a mathematical function- x+2y=n where x is the number of 1-step moves and y is the number of 2-step moves.
        Therefore, the logic is simply to iterate through all possible values of y (from 0 to n//2 (because y handles 2 steps)) and calculate the corresponding x value.
        For each pair (x,y) that satisfies the equation, we can set up a list with either element 'a' (for 1-step) or 'b' (for 2-step) and calculate the number of unique permutations of this list.
        The number of unique permutations is simply the factorial of the length of the list divided by the factorial of the counts of each unique element. 
        OR in other words, it can be calculated using the formula:
        total_permutations = factorial(x + y) / (factorial(x) * factorial(y)) directly.
        The above described method is a basic mathematical formula for permutations when there are repeating elements.
        Finally, we sum up all the unique permutations for all possible (x,y) pairs to get the final answer.

        '''
        arrangements=0  # This will store the total number of unique ways to climb the stairs

        from math import factorial   

        total_ways = 0   # This will store the total number of unique ways to climb the stairs for each unique pair (x,y) satisfying x+2y=n

        for y in range(n//2 + 1):
            x=n-2*y   # Calculate corresponding x value for current y
            #Now calculating permutations for current (x,y) pair
            total_steps=x+y
            arrangements=factorial(total_steps) // (factorial(x) * factorial(y))
            total_ways += arrangements  # Add the arrangements for current (x,y) pair to total ways

        return total_ways  # Return the total number of unique ways to climb the stairs