class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char [] values = s.toCharArray();
        for (int i =0;i<values.length;i++) {
            if (values[i] == '(') {
               stack.push(')'); 
            } else if (values[i] == '[') {
               stack.push(']'); 
            } else if (values[i] == '{') {
               stack.push('}'); 
            }else if(stack.empty() || (stack.pop()!= values[i])) {
               return false;
            }
        }
      return stack.empty();  
    }
}
