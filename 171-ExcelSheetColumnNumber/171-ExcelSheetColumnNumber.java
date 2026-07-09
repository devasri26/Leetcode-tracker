// Last updated: 7/9/2026, 9:15:26 AM

class Solution {
    public int titleToNumber(String columnTitle) {
        
        int n = columnTitle.length();

        int result = 0;
        int index = 0;
        for(int i=n-1;i>=0;i--){
            char curr = columnTitle.charAt(i);  
            result += (curr- 'A' + 1) * (int)Math.pow(26,index);
            index++;
        }

        return result;
        
    }
}