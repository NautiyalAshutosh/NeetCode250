// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroesInNums = 0;
        int productOfNums = 1;
        int negativeNumbers = 0;
        for(Integer num: nums){
            if (num == 0) zeroesInNums++;
            else productOfNums *= num;
            if(num < 0) negativeNumbers++;
        }
        
        int[] resultSet = new int[nums.length];
        if (zeroesInNums > 1) return resultSet;
        for(int i = 0; i< nums.length; i++){
            if ( zeroesInNums > 0 && nums[i] != 0) resultSet[i] = 0;
            else if (nums[i] == 0) resultSet[i] = productOfNums;
            else resultSet[i] = productOfNums/nums[i]; 
        }
        return resultSet;
    }
}