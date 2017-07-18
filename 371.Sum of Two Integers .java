public class Solution {
    public int getSum(int a, int b) {
        //if(b == 0) return a;
        //else return getSum(a^b , (a&b)<<1);
        if(a == 0) return b;
        while(b != 0){
            int temp = a;
            a = a ^ b;
            b = (temp & b) << 1;
        }
        return a;
    }
}