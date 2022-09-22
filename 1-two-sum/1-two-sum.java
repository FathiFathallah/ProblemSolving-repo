import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(target%2==0){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == target/2) {
                    result[count] = i;
                    count++;
                }
            }
            if(count == 2 && (nums[result[0]]+nums[result[1]]==target)) return result;
        }
        //# of instructions = n
        HashMap<Integer,Integer> hashNum = new HashMap<Integer,Integer>();
        for(int i=0 ;i<nums.length ;i++){
            hashNum.put(nums[i],i);
        }
        int difference;
        for(int i=0;i<nums.length;i++){
            difference = target - nums[i];
            if(difference == nums[i]) continue;
            if(hashNum.containsKey(difference)){
                result[0] = i;
                result[1] = hashNum.get(difference);
                return result;
            }
        }
        return null;
    }  
}