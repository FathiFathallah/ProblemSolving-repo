//Recursive Function

public class Solution {


    public static int  binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (nums[mid] == target) return mid;
        if (target > nums[mid] && start != end) {
            return binarySearch(nums, target, mid + 1, end);
        }
        if (target < nums[mid] && start != end) {
            return binarySearch(nums, target, 0, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        /*int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.println(binarySearch(nums, 9, 0, 5));*/
        
        int[] nums = {-1, 0, 3, 5, 9};

        System.out.println(binarySearch(nums, 6, 0, 4));
    }
}
