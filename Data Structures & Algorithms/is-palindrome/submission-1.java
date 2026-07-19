class Solution {
    public boolean isPalindrome(String s) {
        if(1<= s.length() && s.length() <= 1000){
        String onlyletters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        char[] lettersArray = onlyletters.toCharArray();
        int i = 0;
        int j = lettersArray.length -1;
        while(i<j) {
            if(lettersArray[i] == lettersArray[j]){
               i++;
               j--;
            } else {
                return false ;
            }
        }
        return true;
        } 
       return false;
    }
}
