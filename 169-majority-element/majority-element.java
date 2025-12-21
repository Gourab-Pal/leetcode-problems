class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = -1;
        int count = 0;

        for(int i=0; i<n; i++) {
            int current = nums[i];
            if(count==0) {
                majority = current;
                count = 1;
            } else {
                if(current == majority) count++;
                else count--;
            }
        }

        int majorityCount = 0;
        for(int elem : nums) {
            if(elem == majority) majorityCount++;
        }

        return majority;
    }
}