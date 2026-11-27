class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))l.add(i);
        }
        return l;
    }
}