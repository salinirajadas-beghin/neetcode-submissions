class Solution {
    public int characterReplacement(String s, int k) {
        int [] charcount = new int[26];
        int left =0;
        int maxfreq=0;
        int maxWindowSize =0;
        for(int r=0;r<s.length();r++) {
            char rightChar = s.charAt(r);
            charcount[rightChar -'A']++;
            maxfreq=Math.max(maxfreq,charcount[rightChar-'A']);
            if((r-left+1)-maxfreq>k){
            char leftChar = s.charAt(left);
             charcount[leftChar-'A']--;
             left++;
            }
            maxWindowSize = Math.max(maxWindowSize,r-left+1);
        }
        return  maxWindowSize;

    }
}
