class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lenn=nums.length;
        for(int i=0;i<lenn;i++){
            for(int j=i+1;j<lenn;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}