// Last updated: 7/9/2026, 9:14:49 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount = 0;
        int count = 0;
        
        for(int num: nums){
            if(num == 1){
                count++;
            }else{
                count = 0;
            }
            
            if(maxCount < count){
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}
        