/*Input: nums = [3,0,1]
 Output: 2
 Explanation:
 n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.*/

//TC : O(Nlogn)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int refer = 0;
        for(int i=1 ; i<= nums.length ; i++)
        {
            if(nums[i-1] != refer)
            {
                return refer;
            }
            refer++;
        }
    return refer;
    }
}
