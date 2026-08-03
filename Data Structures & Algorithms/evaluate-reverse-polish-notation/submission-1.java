class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token: tokens) {
            if(token.equals("+")) {
              Integer i = Integer.valueOf(stack.pop())+Integer.valueOf(stack.pop());
               stack.push(String.valueOf(i));
            } else if(token.equals("-")) {
              int  first = Integer.parseInt(stack.pop());
              int second = Integer.valueOf(stack.pop());
               stack.push(String.valueOf(second-first));
            } else if(token.equals("/")) {
              int  first = Integer.parseInt(stack.pop());
              int second = Integer.valueOf(stack.pop());
               stack.push(String.valueOf(second/first));
            } else if(token.equals("*")) {
              Integer i = Integer.valueOf(stack.pop())*Integer.valueOf(stack.pop());
               stack.push(String.valueOf(i));
            } else {
                stack.push(token);
            }
        }
        return stack.isEmpty()?0:Integer.parseInt(stack.pop());
        
    }
}
