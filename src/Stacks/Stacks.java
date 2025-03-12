package Stacks;
//What are stacks: Implement Undo Feature, Compiler for parsing syntax, Navigation, Evaluate Expressions
//Last In First Out.
// push(item):o(1) pop():O(1) peek()o(1) isEmpty()o(1)


import java.util.Arrays;
import java.util.Stack;

public class Stacks {

    private int[] items = new int[5];
    private int count = 0;

    public void push(int item){
        if(count==items.length){
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    public int pop(){
        if(count==0){
            throw new IllegalStateException();
        }
        int item = items[--count];
        return item;
    }

    public int peek(){
        if(count==0){
            throw new IllegalStateException();
        }
        return items[count];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void print(){
        for(int i = 0;i<count;i++){
            System.out.println(items[i]);
        }
    }

    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static boolean isBalancedExpression(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if ((ch == ')' && pop != '(') ||
                        (ch == '}' && pop != '{') ||
                        (ch == ']' && pop != '[') ||
                        (ch == '>' && pop != '<')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
