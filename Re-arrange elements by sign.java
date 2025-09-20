/*You should return the array of nums such that the the array follows the given conditions:

    Every consecutive pair of integers have opposite signs.
    For all integers with the same sign, the order in which they were present in nums is preserved.
    The rearranged array begins with a positive integer.*/
// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]

/*Optimised Solution O(N)*/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length]; //creating a new arrray.
        int pos = 0; //Creating the..,               
        int neg = 1; //two pointers.
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i] > 0)
            {
                ans[pos] = nums[i];  //('pos' points to even index)
                pos=pos+2;
            }
            else
            {
                ans[neg] = nums[i]; //('neg' points to odd index)
                neg = neg+2;
            }
        }
        return ans;
    }
}

/*Brute Force method*/
int pos[] = new int[(nums.length)/2];
int neg[] = new int[(nums.length)/2];
int j = 0;
int k = 0;
for(int i=0; i<nums.length ; i++)
  {
    if(nums[i]>0)
      {
         pos[j++] = nums[i]; //An array that stores only positive elements
      }
    else
      {
          neg[k++] = nums[i]; // An array that stores only negative elements
      }
  }
        
j=0; // If we skip this step an 'ArrayIndexOutOfBoundsException' Error will occur.
k=0;
for(int i=0; i< nums.length/2 ; i++)
  {
    nums[2*i] = pos[j++]; //Positive elements at even index.
    nums[2*i + 1] = neg[k++]; //negative elements at odd index.
  }
return nums;
