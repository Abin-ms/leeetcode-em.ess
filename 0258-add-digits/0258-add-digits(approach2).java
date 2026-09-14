class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int resultt = 0;
        while( num !=  0){
            int digit = num % 10;
            resultt = resultt + digit;
            num = num / 10;
        }
        num = resultt;
        }
         return num;
    }
   
}
