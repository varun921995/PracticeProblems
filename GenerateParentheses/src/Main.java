import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        Stack<String> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        backtracking(0,0,stack, result,n);
        return result;
    }

    public static void backtracking(int openN, int closeN, Stack<String> stack, List<String> result, int n){
        if(openN ==  closeN && closeN == n){
            result.add(String.join("",stack));
            return ;
        }
        if(openN <  n){
            stack.add("(");
            backtracking(openN+1, closeN, stack, result, n);
            stack.pop();
        }
        if(closeN <  openN){
            stack.add(")");
            backtracking(openN, closeN+1, stack, result, n);
            stack.pop();
        }

    }
}