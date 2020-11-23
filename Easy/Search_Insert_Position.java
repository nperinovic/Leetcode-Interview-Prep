
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
// Example 4:

// Input: nums = [1,3,5,6], target = 0
// Output: 0
// Example 5:

// Input: nums = [1], target = 0
// Output: 0
class Solution {
 public int searchInsert(int[] nums, int target) {
  int i = 0;
  for(; i < nums.length; i++) {
    if(nums[i] == target) {
      break;
    }
    else if(target < nums[i]) {
      break
    }
  }
   
   if(i == nums.length - 1 && target > nums[i]) {
     return i + 1;
   }
   else return i;
  }
}

//OR

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while(i < nums.length && nums[i] < target)
            i++;
        
        return i;
    }
}



