//(INPUT ARRAY IS SORTED)
/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.*/
/*Input: numbers = [2,7,11,15], target = 9
Output: [1,2]*/

//TC:O(N^2)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 1 ; i<=numbers.length ; i++)
        {
            for(int j = i+1 ; j<=numbers.length; j++)
            {
                if(numbers[i-1]+numbers[j-1] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
