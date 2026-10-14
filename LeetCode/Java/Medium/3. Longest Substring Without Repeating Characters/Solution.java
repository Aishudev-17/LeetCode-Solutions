import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map=new HashSet<>();
        int max=0;
        int left=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            while(map.contains(s.charAt(r))){
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(r));
            max=Math.max(max,r-left+1);
        }
        return max;



    }
}
