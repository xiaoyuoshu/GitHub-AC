public class Solution {
    public int reverse(int x) {
        int for_reverse=0;
        if(x>=0){
            while(x!=0){
                if(Integer.MAX_VALUE/10<for_reverse) return 0;
                else for_reverse*=10;
                if((Integer.MAX_VALUE-x%10)<for_reverse) return 0;
                else for_reverse+=x%10;
                x/=10;
            }
            return for_reverse;
        }
        else{
            while(x!=0){
                if(Integer.MIN_VALUE/10>for_reverse) return 0;
                else for_reverse*=10;
                if((Integer.MIN_VALUE-x%10)>for_reverse) return 0;
                else for_reverse+=x%10;
                x/=10;
            }
            return for_reverse;
        }
    }
}