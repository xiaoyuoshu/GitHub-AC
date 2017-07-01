public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int t[]={0,0};
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    if(t[0]==0&&t[1]==0){
                	    t[0]=i;
                	    t[1]=j;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return t;
    }
}