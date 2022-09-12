class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> stack = new Stack<Character>();
        for(Character i : s.toCharArray()){
            if(i == '('){
                stack.push(i);
                maxDepth = Math.max(maxDepth,stack.size());
            }
            else if(i == ')'){
                stack.pop();
            }
        }
        return maxDepth;
    }
}