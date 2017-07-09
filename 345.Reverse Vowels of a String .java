public class Solution {
    public String reverseVowels(String s) {
        char[] sToArray = s.toCharArray();
        char temp;
        String vowels = "aeiouAEIOU";
        for(int i = 0 , j = s.length() - 1; i < j ;){
            if(vowels.indexOf(sToArray[i]) == -1){
                i++;
                continue;
            }
            if(vowels.indexOf(sToArray[j]) == -1){
                j--;
                continue;
            }
            temp = sToArray[i];
            sToArray[i] = sToArray[j];
            sToArray[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(sToArray);
    }
}