class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(Integer i: nums){
            hashset.add(i);
        }
        if(hashset.size() == nums.length) return false;
        return true;
    }
}
