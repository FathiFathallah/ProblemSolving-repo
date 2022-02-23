class Solution {
    public int romanToInt(String str) {
        int num = 0;
        for(int i=0 ; i<str.length(); i++){
            if(i<str.length()-1){
                if(str.charAt(i) == 'I' && str.charAt(i+1) == 'V') {num+=4; i++;}
                else if(str.charAt(i) == 'I' && str.charAt(i+1) == 'X') {num+=9;i++;}
                else if(str.charAt(i) == 'X' && str.charAt(i+1) == 'L') {num+=40; i++; }
                else if(str.charAt(i) == 'X' && str.charAt(i+1) == 'C') { num+=90; i++; }
                else if(str.charAt(i) == 'C' && str.charAt(i+1) == 'D') { num+=400; i++; }
                else if(str.charAt(i) == 'C' && str.charAt(i+1) == 'M') { num+=900; i++; }
                else if(str.charAt(i) == 'I') num+=1;
                else if(str.charAt(i) == 'V') num+=5;
                else if(str.charAt(i) == 'X') num+=10;
                else if(str.charAt(i) == 'L') num+=50;
                else if(str.charAt(i) == 'C') num+=100;
                else if(str.charAt(i) == 'D') num+=500;
                else num+=1000;
            }
            else{
                if(str.charAt(i) == 'I') num+=1;
                else if(str.charAt(i) == 'V') num+=5;
                else if(str.charAt(i) == 'X') num+=10;
                else if(str.charAt(i) == 'L') num+=50;
                else if(str.charAt(i) == 'C') num+=100;
                else if(str.charAt(i) == 'D') num+=500;
                else num+=1000;
            }
        }
        return num;
    }
}
