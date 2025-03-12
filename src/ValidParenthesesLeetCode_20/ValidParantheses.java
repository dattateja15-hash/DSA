package ValidParenthesesLeetCode_20;

import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                var pop = stack.pop();
                if((ch==')'&& pop!='(') || (ch==']'&&pop!='[') || (ch=='}'&&pop!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
