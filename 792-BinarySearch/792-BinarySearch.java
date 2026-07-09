// Last updated: 7/9/2026, 9:14:48 AM
class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int l= 0;
        int r= n-1;

        while(l<=r){
            int mid= (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }

            else if(target<nums[mid]){
                r=mid-1;
            }

            else{
                l=mid+1;
            }
        }

        return -1;
    }
}