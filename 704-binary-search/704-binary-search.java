class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length -1);
    } 
    public int binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (nums[mid] == target) return mid;
        if (target > nums[mid] && start != end && mid != end) {
            return binarySearch(nums, target, mid + 1, end);
        }
        if (target < nums[mid] && start != end && mid != start) {
            return binarySearch(nums, target, 0, mid - 1);
        }
        return -1;
    }    
}