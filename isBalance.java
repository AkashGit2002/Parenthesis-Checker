package src;

import java.util.Stack;

public class isBalance {
    public static void main(String[] args) {
    String str = "{([])}";
    Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){

        if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
            st.push(str.charAt(i));

        } else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') ||
                (str.charAt(i) == '}' && st.peek() == '{') ||
                (str.charAt(i) == ')' && st.peek() == '('))) {

            st.pop();

        } else {
            st.push(str.charAt(i));
        }
    }
        if(st.empty())
                System.out.println("Balance palindrome");
        else
                System.out.println("Not Balance palindrome");
    }
}


