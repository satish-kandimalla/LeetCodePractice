import java.util.HashMap;
import java.util.Stack;

public class LC_20_InvalidParenthesis {
    public boolean checkIsValid(String s){
        HashMap<Character, Character> mapping = new HashMap<Character, Character>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else{
                if(st.empty()){
                    return false;
                }else{
                    Character c = st.pop();
                    if(mapping.get(s.charAt(i)) != c){
                        return false;
                    }
                }
            }
        }
        if(!st.empty()){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        LC_20_InvalidParenthesis lc = new LC_20_InvalidParenthesis();
        String s = "({";

        System.out.println(lc.checkIsValid(s));
    }
}
