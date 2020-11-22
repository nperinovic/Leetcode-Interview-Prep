// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false

class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 1) {
            return false;
        }
        
        Stack<Character> st = new Stack<>();
        
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(map.containsKey(c)) {
                char top = st.empty() ? '#' : st.pop();
                
                if(top != map.get(c)) {
                    return false;
                }
            }
            else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}