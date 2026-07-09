// Last updated: 7/9/2026, 9:15:24 AM
class Solution {
    public int trailingZeroes(int n) {
        if (n < 0 || n == 0) {
            return 0;
        }
        int count = 0;
        while (n >= 5) {
            count += n / 5; 
            n /= 5;        
        }
        return count;
    }
}