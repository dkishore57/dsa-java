import java.util.*;


public class Stack_queue {
    public static void main(String[] args) {

        System.out.println(valid_parenthesis("{}{}{}{}{}}"));}

    static Boolean valid_parenthesis(String s) {
        Stack<Character> dk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                dk.push(ch);
            }
            else {
                if (dk.isEmpty()){
                    return false;
                }
                else{
                    char top = dk.pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                        }
                }


            }

        }
        return dk.isEmpty();
    }



}