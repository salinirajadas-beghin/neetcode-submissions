class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] inputs = s.toCharArray();
        int start = 0;
        int e = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
    
        while(e<inputs.length) {
                while (set.contains(inputs[e])) { 
                set.remove(inputs[start]); 
                start += 1; 
            } 
                   
                set.add(inputs[e]);               
                ans = Math.max(ans,e-start+1);
                e+=1;
        }
        return ans;
        
    }
}
