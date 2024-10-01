// has not been tested yet
public class BraceMatcher {
    public static boolean isValid(String s) {
        LinkedListStack<Character> braceStack = new LinkedListStack<>(); 
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                braceStack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (braceStack.isEmpty()) {
                    return false; 
                }
                
                Character popped = braceStack.pop(); 
                if (popped == '[' && c != ']') {return false;}
                if (popped == '(' && c != ')') {return false;}
                if (popped == '{' && c != '}') {return false;}
            
            }
        }
        return braceStack.isEmpty(); 
    }
}
