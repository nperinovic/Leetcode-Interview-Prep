// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// Follow up: The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// Example 3:

// Input: nums1 = [0,0], nums2 = [0,0]
// Output: 0.00000
// Example 4:

// Input: nums1 = [], nums2 = [1]
// Output: 1.00000
// Example 5:

// Input: nums1 = [2], nums2 = []
// Output: 2.00000

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] e = new int[nums1.length + nums2.length];
        int count = 0;
        int i = 0; int j = 0;
        for(; i < nums1.length && j < nums2.length;) {
           if(nums1[i] < nums2[j]) {
               e[count] = nums1[i];
               i += 1;
           } 
            else {
                e[count] = nums2[j];
                j += 1;
            }
            count += 1;
        }
        
        for(;count < e.length;) {
            if(i < nums1.length) {
                e[count] = nums1[i];
                i += 1;
            }
            else if(j < nums2.length){
                e[count] = nums2[j];
                j += 1;
            }
            count += 1;
        }
        
        if(e.length % 2 == 0 && e.length != 0) {
            return (double)(e[e.length / 2] + e[(e.length / 2) - 1]) / 2;
        }
        else if (e.length % 2 != 0 && e.length != 0) {
            return (double)(e[e.length / 2]);
        }
        else {
            return 0;
        }
    }
}