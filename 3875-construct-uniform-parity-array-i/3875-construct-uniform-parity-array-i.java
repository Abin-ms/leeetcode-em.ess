class Solution {
    public boolean uniformArray(int[] nums1) {

        int oddNumber = -1;

        for (int num : nums1) {
            if (num % 2 != 0) {
                oddNumber = num;
                break;
            }
        }

        
        if (oddNumber == -1) {
            return true;
        }

        
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0) {
                nums1[i] = nums1[i] - oddNumber;
            }
        }

        return true;
    }
}