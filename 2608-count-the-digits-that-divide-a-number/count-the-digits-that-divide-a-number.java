class Solution {
    public int countDigits(int num) {

        int count=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
             num=num/10;
           if(rem != 0 && temp % rem == 0)
{
                count++;
            }
        }
        return count;
        
    }
}