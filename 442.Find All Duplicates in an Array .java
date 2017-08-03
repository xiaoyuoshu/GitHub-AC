import java.util.*;
public class Solution {
    public List<Integer> findDuplicates1(int[] nums) {
        Hashtable hashtable = new Hashtable();
        List<Integer> for_return = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(hashtable.containsKey(nums[i])){
                for_return.add(nums[i]);
            }
            else{
                hashtable.put(nums[i],i);
            }
        }
        return for_return;
    }
	public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> for_return = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i]) - 1] < 0) for_return.add(Math.abs(Math.abs(nums[i])));
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return for_return;
    }
}