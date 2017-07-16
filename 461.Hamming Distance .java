public class Solution {
    public int hammingDistance(int x, int y) {
        int xy = x ^ y , for_return = 0;
        for(int i = 0; i < 32; i++){
            for_return += xy & 1;
            xy = xy >> 1;
        }
        return for_return;
    }
}