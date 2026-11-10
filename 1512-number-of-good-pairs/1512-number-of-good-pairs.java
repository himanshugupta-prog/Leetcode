class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int freq = entry.getValue();
            count+= (freq*(freq-1))/2;
        }
        return count;  

    }
}