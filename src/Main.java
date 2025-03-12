import Stacks.Stacks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        int top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(Stacks.reverseString("Datta Teja Nalluri"));
        System.out.println(Stacks.isBalancedExpression("(a+b*C"));
        Stacks stack2 = new Stacks();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.print();
        int pop =  stack2.pop();
        System.out.println(pop);
        stack2.print();
        System.out.println(stack2.isEmpty());
    }

}