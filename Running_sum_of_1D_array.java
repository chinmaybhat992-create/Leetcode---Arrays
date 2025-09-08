// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
/*This is not a recommended solution because it has O(n^2) TC.*/
class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                ans[i] = ans[i] + nums[j];
            }
        }
       return ans;
    }
}

/*This is O(N) TC but the input array itself is modified which is not a good habit*/
for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];

        }
