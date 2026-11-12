class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int result = 0;
        int inc_count = 0;
        int dec_count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                inc_count = 0;
                dec_count = 0;
            }
            else if(nums[i]<nums[i+1]){
                inc_count++;
                dec_count = 0;
                result = Math.max(result,inc_count);
            }
            else{
                dec_count++;
                inc_count = 0;
                result = Math.max(result,dec_count);
            }
        }
        if(result == 0)return 1;
        return result+1;
    }
}