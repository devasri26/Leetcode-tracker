// Last updated: 7/9/2026, 9:15:58 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String [] result=s.split(" ");
        int n=result.length;
        count=result[result.length-1].length();
        return count;
    }
}
