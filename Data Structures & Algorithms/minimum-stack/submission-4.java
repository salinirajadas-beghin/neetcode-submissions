class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val <= minstack.peek()) {
           minstack.push(val); 
        }
    }
    
    public void pop() {
      if (!minstack.isEmpty() && (stack.peek().equals(minstack.peek()))) {
            minstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) {
            return 0;
        }
      return  stack.peek();
    }
    
    public int getMin() {
        if(minstack.isEmpty()) {
            return 0;
        }
      return  minstack.peek();
    }
}
