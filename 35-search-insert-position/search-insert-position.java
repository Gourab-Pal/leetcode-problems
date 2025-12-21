class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int p1 = 0;
        int p2 = n-1;
        while(p1<=p2) {
            int mid = (p1+p2)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) {
                p1 = mid+1;
            } else {
                p2 = mid-1;
            }
        }

        return p1;
    }
}