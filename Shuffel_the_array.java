/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/

/*Posssible in other way*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
       int ans[] = new int[2*n];
       int k = 0;
       int i = 0;
       int j = n;
       while (k<nums.length)
       {
        ans[k++] = nums[i++];
        ans[k++] = nums[j++];
       }
       return ans;
    }
}
