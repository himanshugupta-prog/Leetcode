class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int curr = 0;
            for(int num : accounts[i]){
                curr+=num;
            }
            max = Math.max(curr,max);
        }
        return max;
    }
}