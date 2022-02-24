class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length -1] +1 < 10) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        int sum = 0;
        int carry = 1;
        for(int i=digits.length-1; i>=0 ; i--){
            sum = (digits[i] + carry)%10;
            carry = (digits[i] + carry)/10;
            digits[i] = sum;
        }
        if(carry == 1){
            int[] digitsCarry = new int[digits.length+1];
            digitsCarry[0] = carry;
            System.arraycopy(digits, 0, digitsCarry, 1, digits.length);
            return digitsCarry;
        }
        return digits;
    }
}
