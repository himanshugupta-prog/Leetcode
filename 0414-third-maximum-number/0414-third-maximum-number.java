class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[nums.length-1];
        int k = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=ans){
                ans = nums[i];
                k++;
            }
            if(k==2)return ans;
        }
        return nums[nums.length-1];
    }
}