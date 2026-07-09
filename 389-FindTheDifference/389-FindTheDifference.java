// Last updated: 7/9/2026, 9:14:53 AM

class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0; 
        for (char c : s.toCharArray()) { 
            result ^= c;
                          
        }
        for (char c : t.toCharArray()) { 
            result ^= c; 
        }
        return result;
    }
} 