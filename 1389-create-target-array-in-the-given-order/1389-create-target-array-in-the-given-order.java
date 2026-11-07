class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            l.add(index[i],nums[i]);
        }
        int[] result = new int[l.size()];
        for(int i=0;i<l.size();i++){
            result[i]=l.get(i);
        }
        return result;
    }
}