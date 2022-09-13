class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int j = 1;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(stack.empty()){
                    result += s.substring(j, i);
                    j = i + 2;
                }
            }
        }
        return result;
    }
}
