class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String stack = "";
        int smallestIndex = 0;
        int smallest = strs[0].length();
        for(int i=1 ; i<strs.length ; i++){
            if(strs[i].length() < smallest ) {
                smallest = strs[i].length();
                smallestIndex = i;
            }
        }
        
        boolean equal = true;
        for(int i=0 ;i<strs[smallestIndex].length();i++){
            for(int j=0 ; j<strs.length ; j++){
                stack += strs[j].charAt(i);
            }
            
            for (int k = 1; k < stack.length() ; k++){
                if (stack.charAt(k) != stack.charAt(0)){
                    equal = false;
                    break;
                }
            }  
            if(equal){
                result += stack.charAt(0);
                stack = "";
            } 
        }
        return result;
    }
}
