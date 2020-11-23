// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        
        int aTemp = a.length() - 1;
        int bTemp = b.length() - 1;
        int carry = 0;
        
        while(aTemp >= 0 || bTemp >= 0) {
            int sum = carry;
            if(aTemp >= 0) {
                sum += a.charAt(aTemp--) - '0'; // - '0' will give us 0 if a.charAt(aTemp--) is '0' and 1 if a.charAt(aTemp--) = '1'
            }
            if(bTemp >= 0) {
                sum += b.charAt(bTemp--) - '0'; // - '0' will give us 0 if a.charAt(aTemp--) is '0' and 1 if a.charAt(aTemp--) = '1'
            }
            
            str.insert(0, sum % 2); // inserting at 0 will shift everything back one. sum % 2 since sum is either 0, 1, or 2
            carry = sum / 2; // If sum is every 2 we will get a 1, meaning that we need to shift. If it's a 1 or 2 this will give a carry of 0
        }
        
        if(carry > 0) {
            str.insert(0, 1);
        }
        
        return str.toString();
    }
}
