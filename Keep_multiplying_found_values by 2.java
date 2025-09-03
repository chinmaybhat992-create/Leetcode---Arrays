/*You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

    If original is found in nums, multiply it by two (i.e., set original = 2 * original).
    Otherwise, stop the process.
    Repeat this process with the new number as long as you keep finding the number.

Return the final value of original.*/

// Input: nums = [5,3,6,1,12], original = 3
// Output: 24

/*This is O(N) time complexity*/
/*another way: Use Hashset or sort the array before searching 'original'*/ //Sorting uses O(nlogn) tc.
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] == original)   
            {
                original = 2 * original;
                i=0;  //The searching again starts from 0 only if the "original" or "orginal*2" found in the array.
            }
            else
            {
            i++;
            }
        }
        return original; //returned if not found in the array.
    }
}
