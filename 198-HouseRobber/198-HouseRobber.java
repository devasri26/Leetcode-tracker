// Last updated: 7/9/2026, 9:15:21 AM

class Solution {
    public int rob(int[] nums) {
        int p1=0,p2=0,temp;
        for(int i=0;i<nums.length;i++) {
           temp=p1;
           p1=Math.max(p1,p2+nums[i]);
           p2=temp;
        }
        return p1; 
    }
}
