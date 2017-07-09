public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder for_return = new StringBuilder();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int tag = 0 , i = a.length() - 1 , j = b.length() - 1;
        for(; i >= 0 || j >= 0 ; i-- , j--){
            if(i >= 0) tag += ac[i] - '0';
            if(j >= 0) tag += bc[j] - '0';
            for_return.insert(0 , tag % 2);
            tag /= 2;
        }
        if(tag != 0) for_return.insert(0 , tag);
        return for_return.toString();
    }
}