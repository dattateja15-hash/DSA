package MinStackLeetCode;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }

    public void push(int item){
        stack.push(item);
        if(minStack.isEmpty()||item<minStack.peek()){
            minStack.push(item);
        }

    }

    public void pop(){
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

}
