class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for(Character i : s.toCharArray()){
            if(i == '('){
                depth++;
            }
            else if(i == ')'){
                maxDepth = Math.max(maxDepth,depth);
                depth--;
            }
        }
        return maxDepth;
    }
}
