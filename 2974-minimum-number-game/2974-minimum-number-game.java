class Solution {
    public int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        int i=0;
        while(i+1<=nums.length){
            int a = nums[i];
            int b = nums[i+1];
            result[i] = b;
            result[i+1] = a;
            i +=2;
        }
        return result;
    }
}