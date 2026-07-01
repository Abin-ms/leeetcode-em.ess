class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ans = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                ans++;

                if (ans > res) {
                    res = ans;
                }

            } else {
                ans = 0;
            }
        }

        return res;
    }
}