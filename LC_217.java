/*CONTAINS DUPLICATIES*/

// Time complexity O(n) :
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>sets = new HashSet<>();  
        
        for(int i=0; i<nums.length ; i++) 
        {
             if (sets.contains(nums[i]))  // checks whether the element is in the set
             {
                return true;
             }
             else
             {
                sets.add(nums[i]); // if not, then it adds that element to the set
             }
        }
        return false;    
    }
}
