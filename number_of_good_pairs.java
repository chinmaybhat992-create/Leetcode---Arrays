/*Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/

//Try doing in O(n) TC.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int number = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            for (int j = i+1 ; j < nums.length ; j++)
            {
                   if(nums[i] == nums[j])
                   {
                    number+=1;
                   }
            }
        }
      return number;  
    }
}
