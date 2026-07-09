// Last updated: 7/9/2026, 9:14:41 AM

class Solution {
    public int dayOfYear(String date) {
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
        int sum = 0;
        while(month>=1)
        {
            if(day!=0){
                sum+=day;
                day = 0;
                month--;
            }
            for(int i = month-1;i>=0;i--)
            {

                if(i == 1)
                {
                    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                        sum+=60;
                        return sum;
                    }else
                    {
                        sum+=59;
                        return sum;
                    }

                    
                }
                else{
                    sum+=days[i];
                }
            }

            month--;
        }
        return sum;
    }
}