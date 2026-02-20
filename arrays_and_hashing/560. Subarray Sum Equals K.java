class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int i= 0; int j = 0;
        int sum = 0;
        while(i <= j  && j <  nums.size()){
            sum += nums[j];
            if (sum == k){
                total++;
                sum -= nums[i++];
            }
            else if(sum < k) sum += nums[j++];
            else{
                sum -= nums[i++];
            }
        }
        return total;
    }
}