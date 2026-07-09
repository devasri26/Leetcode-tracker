// Last updated: 7/9/2026, 9:15:09 AM
class Solution {
    public boolean isPowerOfTwo(int n){
        long num = 1;
        while(num < n){
            num = num * 2;
        }
        return num == n;
    }  
}