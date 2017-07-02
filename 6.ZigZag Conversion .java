public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        char[] sA = s.toCharArray();
        int rows = 0, direction = 1; 
        StringBuffer[] stringbuffer = new StringBuffer[numRows];
        for(int i = 0;i < numRows;i++) stringbuffer[i] = new StringBuffer("");
        for(int i = 0;i < s.length();i++){
            stringbuffer[rows].append(sA[i]);
            rows += direction;
            if(rows > numRows-1){
                rows -= 2;
                direction = -1;
            }
            if(rows < 0){
                rows = 1;
                direction = 1;
            }
        }
        String for_return = "";
        for(int i = 0;i < numRows;i++) for_return += stringbuffer[i];
        return for_return;
    }
}