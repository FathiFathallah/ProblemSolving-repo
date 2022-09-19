class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(Integer i: nums){
            if(hashset.contains(i)) return true;
            hashset.add(i);
        }
        return false;
    }
}
