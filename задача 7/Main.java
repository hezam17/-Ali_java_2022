import java.util.HashMap;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
//Али Хезам 11-013
class Main{

    public static void main(String args[]) {

        System.out.print("  {({)}  ");
        System.out.println(isValid("{({)}"));
        System.out.print("  {([{}])}  ");
        System.out.println(isValid("{([{}])}"));
        System.out.print("  {)     ");
        System.out.println(isValid("{)"));
        System.out.print("  {}     ");
        System.out.println(isValid("{}"));

    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.containsValue(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

