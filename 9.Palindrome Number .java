public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 10 && x >= 0) return true;
        if(x < 0 || x % 10 == 0) return false;
        int reverse = 0;
        while(x > reverse){
            reverse = reverse * 10 + x % 10;
            x /=10;
        }
        if(x == reverse || reverse / 10 == x) return true;
        else return false;
    }
}