// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
// Example 3:

// Input: s = "a"
// Output: "a"
// Example 4:

// Input: s = "ac"
// Output: "a"


class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int l1 = 0;
        int l2 = 0;
        int high = 0;
        int low = 0;
        
        for(int i = 0; i < s.length(); i++) {
            max = Math.max(helper(i + 1, i, s), helper(i, i, s));
            if(max > high - low) {
                low = i - ((max - 1)/2);
                high = i + (max / 2);
            }
        }
        return s.substring(low, high + 1);
    }
    
    public int helper(int high, int low, String s) {
        while(high < s.length() && low >= 0 && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;  
        }
        
        return high - low - 1;
        
    }
}