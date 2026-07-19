class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
      if(1<=s.length() && t.length()<= 50000){
         char[] sArray = s.toCharArray();
         char[] tArray = t.toCharArray();
         Arrays.sort(sArray);
         Arrays.sort(tArray);
         return Arrays.equals(sArray,tArray);

      }else {
        return false;
      }
    }
}
