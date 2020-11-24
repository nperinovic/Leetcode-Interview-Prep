// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

 

// Example 1:

// Input: x = 4
// Output: 2
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt((double)x);
    }
}

//or 

class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x;
        if (x==0 || x==1) return x;
        
        while(true){
            int mid = left + (right-left)/2;
            if (mid <=  x/mid && mid+1 > x/(mid+1))
                return mid; 
            if(mid < x/mid)
                left = mid + 1;
            else 
                right = mid-1;
        }
    }
}
