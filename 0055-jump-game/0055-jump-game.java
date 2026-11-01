class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int energy = nums[0];
        for(int i=1;i<nums.length;i++){
            if(energy ==0) return false;
            energy--;
            if(nums[i]>energy) energy = nums[i];
        }
        return true;
    }
}