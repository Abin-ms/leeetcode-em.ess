class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minlength = strs[0].length();
        for( int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() < minlength){
                minlength = strs[i].length();
            }
        }

        for( int i = 0 ; i < minlength ; i++){
            char reference = strs[0].charAt(i);
            for( int j = 1 ; j < strs.length ; j++){
                if(strs[j].charAt(i) != reference){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0 , minlength);
        
    }
}