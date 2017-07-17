public class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int first = 1;
        int second = 1;
        int temp;
        for(int i = 1; i < n; i++){
            temp = second;
            second += first;
            first = temp;
        }
        return second;
    }
}