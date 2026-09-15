class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s = new HashSet<>();

        for(int num : nums1){
            s.add(num);
        }

        Set<Integer> s1 = new HashSet<>();

        for(int num : nums2){
            if(s.contains(num)){
                s1.add(num);
            }
        }

        int[] result = new int[s1.size()];
        int i = 0;

        for(int num : s1){
            result[i] = num;
            i++;
        } 
      return result;  
    }
}