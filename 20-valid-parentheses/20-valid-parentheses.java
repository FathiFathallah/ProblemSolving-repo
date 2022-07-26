class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') stack.push(s.charAt(i));
            else{
                if( stack.empty() || !isCorrespondent(stack.pop(),s.charAt(i)) ) return false;
            }
        }
        if(!stack.empty()) return false;
        return true;
}
    public boolean isCorrespondent(char x, char y){
        if(x == '(' && y == ')') return true;
        if(x == '{' && y == '}') return true;
        if(x == '[' && y == ']') return true;
        return false;            
    }
}