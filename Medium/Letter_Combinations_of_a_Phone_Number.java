// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
// Example 1:

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        if(digits.length() == 0) {
            return ret;
        }
        
        String[] maps = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        helper(ret, digits, "", 0, maps);
        return ret;
    }
    
    public void helper(List<String> ret, String digits, String current, int index, String[] maps) {
        if(index == digits.length()) {
            ret.add(current);
            return;
        }
        
        String letters = maps[digits.charAt(index) - '0']; // - '0' to convert to integer
        for(int i = 0; i < letters.length(); i++) {
            helper(ret, digits, current + letters.charAt(i), index + 1, maps);
        }
    }
}
