package EvaluateReversePolishNotationLeetCode_150;

import java.util.Stack;

public class EvaluateReversePolishNotation {
//["2","1","+","3","+"]
    public static int evaluateReversePolishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if (!"*+/-".contains(token)){
                stack.push(Integer.parseInt(token));
                continue;
            }
            int number1 = stack.pop();
            int number2 = stack.pop();
            int result = 0;
            switch(token){
                case "*":
                    result = number1 * number2;
                    break;
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
            }
            stack.push(result);
        }
        return stack.peek();
    }

}
