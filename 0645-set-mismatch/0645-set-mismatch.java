class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(map.getOrDefault(i,0)>1)ans[0]=i;
            if(map.getOrDefault(i,0)==0)ans[1]=i;
        }
        return ans;
    }
}