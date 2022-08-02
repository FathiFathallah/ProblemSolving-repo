
//RUNNING TIME IN WORST CASE = N --> NOT THAT GOOD
class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        for(int number : nums){
            if(number == target) return i;
            else if(number > target) break;
            i++;
        }
        return -1;
    }    
}
