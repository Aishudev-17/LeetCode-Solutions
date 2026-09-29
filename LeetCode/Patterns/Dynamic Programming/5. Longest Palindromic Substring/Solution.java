class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,end=0;
        for(int i=0;i<n;i++){
            int p1=i-1;
            int p2=i+1;
            while(p1>=0 && p2<s.length() && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            if(p2-p1-1>end-start+1){
            start=p1+1;
        end=p2-1;}

             p1=i;
             p2=i+1;
            while(p1>=0 && p2<s.length() && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            if(p2-p1-1>end-start+1){
            start=p1+1;
        end=p2-1;}


        }
        return s.substring(start,end+1);
        
        
    }
}