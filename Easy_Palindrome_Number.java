
// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

// Follow up: Could you solve it without converting the integer to a string?

 

// Example 1:

// Input: x = 121
// Output: true
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String xx = Integer.toString(x);
        String yy = new StringBuilder(xx).reverse().toString();
        
        return xx.equals(yy);      
    }
}