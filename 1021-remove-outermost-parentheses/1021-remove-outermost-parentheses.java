class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int j = 1;
        int opened = 0; 
        int closed = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                opened++;
            }
            else{
                closed++;
                if(opened == closed){
                    result += s.substring(j, i);
                    j = i + 2;
                }
            }
        }
        return result;
    }
}