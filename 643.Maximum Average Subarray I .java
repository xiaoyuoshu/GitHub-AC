public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double for_return = 0 , sum = 0;
        for(int i = 0; i < k ; i++){
            sum += nums[i];
        }
        for_return = sum;
        for(int i = k; i < nums.length ; i++){
            sum = sum - nums[i - k] + nums[i];
            for_return = for_return > sum ? for_return : sum;
        }
        return for_return / k;
    }
}