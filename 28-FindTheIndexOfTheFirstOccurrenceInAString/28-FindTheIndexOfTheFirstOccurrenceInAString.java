// Last updated: 7/9/2026, 9:16:12 AM

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
    return -1;
    }
}