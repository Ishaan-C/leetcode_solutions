#  💻 LeetCode Solutions

This repository contains my solutions to various [LeetCode](https://leetcode.com) problems — written as part of my learning journey as a high school student exploring computer science.  

---

## 🧠 Languages Used
- Java  
- Python  

---

## 🚀 Solved Problems
| #  | Problem | Language | Approach | Status | Standout Performances |
|----|---------|----------|----------|--------|----------------------|
| 1  | [Two Sum](https://leetcode.com/problems/two-sum/) | Java | Brute Force using nested loops | ✅ Accepted | – |
| 2  | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Java | String + Index manipulation | ✅ Accepted | – |
| 3  | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Java | Merging+Sorting Arrays, Finding Median of Combined Array | ✅ Accepted | – |
| 4  | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Java | Forming reversed number and comparing | ✅ Accepted | – |
| 5  | [ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/) | Java | Identifying the pattern in each row and adjusting for special cases in first and last row | ✅ Accepted | – |
| 6  | [Roman To Integer Conversion](https://leetcode.com/problems/roman-to-integer/) | Python | Comparing adjacent values and then adding or subtracting | ✅ Accepted | – |
| 7  | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Java | Comparing the characters of the first string with other strings | ✅ Accepted | – |
| 8  | [Valid Parenthesis](https://leetcode.com/problems/valid-parentheses/) | Python | Storing immediate closing bracket in an array and comparing | ✅ Accepted | – |
| 9  | [Remove Duplicates from a Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Python | Identifying unique elements and moving them to the front of the array | ✅ Accepted | – |
| 10 | [Remove Element](https://leetcode.com/problems/remove-element/) | Python | Identifying the elements not equal to val and moving them to the front of the array | ✅ Accepted | Beats 100% (runtime) |
| 11 | [Index of First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Java | Using Java's inbuilt `.indexOf` function | ✅ Accepted | Beats 100% (runtime) |
| 12 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Python | Using Binary Sort | ✅ Accepted | Beats 100% (runtime) |
| 13 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Python | Removing trailing spaces and counting using loops | ✅ Accepted | Beats 100% (runtime) |
| 14 | [Plus One](https://leetcode.com/problems/plus-one/) | Java | Handle edge case first- all 9s. Then, handle general cases by carrying 1 | ✅ Accepted | Beats 100% (runtime) |
| 15 | [Add Binary](https://leetcode.com/problems/add-binary/) | Python | Convert both strings to the same length. Use binary rules for addition. Pass the carry forward | ✅ Accepted | – |
| 16 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Python | Using binary search to narrow down the range where the square root of x might be | ✅ Accepted | Beats 100% (runtime) |
| 17 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Python | Using combinatorics: for each possible count of 2-steps y, compute x = n − 2y and sum the permutations (x+y)! / (x!·y!) | ✅ Accepted | Beats 100% (runtime) |
| 18 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Java | Copy nums2 into nums1 and sort the array using `Arrays.sort` | ✅ Accepted | - |
| 19 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Java | Track the minimum price so far and update the maximum profit in a single pass | ✅ Accepted | - |
| 20 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Java | Filter the string to only alphanumeric characters, convert to lowercase, and compare with its reverse | ✅ Accepted | - |
| 21 | [Majority Element](https://leetcode.com/problems/majority-element/) | Java | Sort the array, scan consecutive elements to count frequencies (handle last run separately), return element with max count | ✅ Accepted | - |
| 22 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | Java | Treat string as base-26 (`A=1…Z=26`), multiply each char by 26^(position) from left, sum all | ✅ Accepted | - |
| 23 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | Python | Convert number to Excel-style base-26; handle `0 → Z` case using `//26 - 1`; build in reverse | ✅ Accepted | Beats 100% (runtime) |
| 24 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Python | Sort array in-place and check adjacent elements for duplicates; return `True` if any pair matches, else `False` | ✅ Accepted | Beats 95% (memory) |
| 25 | [Add Digits](https://leetcode.com/problems/add-digits/) | Java | Obtain the sum of the digits and pass this sum recursively to the same method until the sum is a single digit number | ✅ Accepted | Beats 75% (runtime) |
| 26 | [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/) | Java | Store original number to sum other variable. Extract each digit and check if it divides the number | ✅ Accepted | Beats 90% (runtime) |
| 27 | [Reverse Words in a String (III)](https://leetcode.com/problems/reverse-words-in-a-string-iii/) | Java | Extract words individually and reverse them adding them to a new string in correct order | ✅ Accepted | - |











---

### 📜 Notes
I’m solving these problems from first principles, using only the concepts I’ve learned so far. My goal is to strengthen my reasoning and problem-solving skills with each challenge, while learning something new from every problem.


