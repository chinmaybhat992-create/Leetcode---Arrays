/*You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:
Replace each even number with 0.
Replace each odd numbers with 1.
Sort the modified array in non-decreasing order.
Return the resulting array after performing these operations.

Input: nums = [1,5,1,4,2]
Output: [0,0,1,1,1]*/

class Solution {
    public int[] transformArray(int[] nums) {
        // int result[] = new int[nums.length];
        // int zeroCount = 0, oneCount = 0;
      for(int i =0; i<nums.length ; i++)
      {
        if ( nums[i]%2 == 0)
        {
            nums[i] = 0;
         }
        else
        {
            nums[i] = 1;
        }
      }

      Arrays.sort(nums); //-----> TC = O(nlogn)
      return nums; 
    }
}

/* O(n) Time Complexity*/
          ^
          |
          |         
//         int i = 0;
//         int j = 0;
//       while(i<zeroCount || j<oneCount){
//         if(i<zeroCount)
//             result[i++] = 0;
//         if(j<oneCount)  
//             result[zeroCount+j++] = 1;
//       }

//       return result;  
//     }
// }
