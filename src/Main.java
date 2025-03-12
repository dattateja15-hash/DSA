import MinStackLeetCode.MinStack;
import Stacks.Stacks;
import ValidParenthesesLeetCode_20.ValidParantheses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(-1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }

}