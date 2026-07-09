// Last updated: 7/9/2026, 9:16:25 AM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,d,ans=0;
        if(x<0 ||(x!=0 && x%10==0))
        return false;
        while(x!=0)
        {
            d=x%10;
            ans=ans*10+d;
            x=x/10;
        }
        if(ans==temp)
        return true;
        else
        return false;
    }
}
        
