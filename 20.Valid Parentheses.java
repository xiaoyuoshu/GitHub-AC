public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char tag;
        for(int i = 0;i < s.length();i++){
            tag = s.charAt(i);
            if(tag == '(' || tag == '[' || tag == '{'){
                stack.push(tag);
            }
            else{
                if(tag == ')'){
                    if((!stack.isEmpty())&&stack.pop()=='(')continue;
                    else return false;
                }
                if(tag == ']'){
                    if((!stack.isEmpty())&&stack.pop()=='[') continue;
                    else return false;
                }
                if(tag == '}'){
                    if((!stack.isEmpty())&&stack.pop()=='{') continue;
                    else return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}