// Input: nums = [1,2,1]  ,  // Input: nums = [1,3,2,1]
// Output: [1,2,1,1,2,1]  ,  // Output: [1,3,2,1,1,3,2,1]
                               
/*using two pointers method*/

class Solution {
    public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      int ans[] = new int[2*n];
      for (int i=0 ; i<n ; i++)
       {
         ans[i] = nums[i];
         ans[i+n] = nums[i];
       }
     return ans;
    }
}
