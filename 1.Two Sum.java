import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable hashtable = new Hashtable();
        int for_return[] = new int[2];
        for(int i = 0;i < nums.length;i++){
            int tag = target - nums[i];
            if(hashtable.containsKey(tag)){
                for_return[0] = (int)hashtable.get(tag);
                for_return[1] = i;
                break;
            }
            hashtable.put(nums[i],i);
        }
        return for_return;
    }
}