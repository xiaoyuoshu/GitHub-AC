import java.util.*;
public class Solution {
	//双向指针
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> for_return = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1, high = nums.length -1;
            while(low < high){
                if(nums[i] + nums[low] + nums[high] >0){
                    high--;
                }
                else if(nums[i] + nums[low] + nums[high] < 0){
                    low++;
                }
                else{
                    for_return.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low < high && nums[low] == nums[low + 1]) low++;
                    while(low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                }
            }
        }
        return for_return;
    }
	//hashtable
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> for_return = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            Hashtable hashtable = new Hashtable();
            for(int j = i + 1; j < nums.length; j++){
                int tag = 0 - nums[i] - nums[j];
                if(hashtable.containsKey(tag)){
                    if((int)hashtable.get(tag) == 0){
                        for_return.add(Arrays.asList(nums[i],tag,nums[j]));
                        hashtable.replace(tag, 0, 1);
                    }
                }
                else hashtable.put(nums[j] , 0);
            }
        }
        return for_return;
    }
}