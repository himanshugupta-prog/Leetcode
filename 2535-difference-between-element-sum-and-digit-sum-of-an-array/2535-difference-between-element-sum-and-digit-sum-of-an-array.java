class Solution {
    public int d_sum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        for(int i=0;i<nums.length;i++){
            element_sum += nums[i];
        }
        int digit_sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >9){
                digit_sum += d_sum(nums[i]); 
            }
            else{
                digit_sum += nums[i];
            }
        }
        int x = element_sum - digit_sum;
        return x;
    }
}