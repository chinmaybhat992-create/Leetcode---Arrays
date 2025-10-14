/*Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
Note: A subarray is a contiguous part of any given array.

Examples:
Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.

Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.

Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.*/

//TC:O(N) ie Optimised solution.
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0;
        int j = 0;
        int Max = 0;
        int sum = 0;
        while(j<arr.length)
        {
            sum = sum + arr[j];
            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                if(sum >= Max)
                {
                    Max = sum;
                }
                
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return Max;
    }
}

//Brute Force [TLE] . TC: O(n*k)
for (int i = 0; i <= arr.length - k; i++) {
    sum = 0;
    for (int j = i; j < i + k; j++) {
        sum = sum + arr[j];
    }
    if (sum >= Max) {
        Max = sum;
    }
}
return Max;
