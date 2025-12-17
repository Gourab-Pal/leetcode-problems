class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxValue = Long.MIN_VALUE;

        for(int j=1; j<=(n-2); j++) {
            int maxLeft = Integer.MIN_VALUE;
            int maxRight = Integer.MIN_VALUE;
            for(int i=0; i<j; i++) {
                maxLeft = Math.max(maxLeft, nums[i]);
            }
            for(int k=j+1; k<n; k++) {
                maxRight = Math.max(maxRight, nums[k]);
            }

            long value = (long) (maxLeft - nums[j]) * maxRight;
            if(value>=0) {
                maxValue = Math.max(value, maxValue);
            }
        }

        if(maxValue < 0) return 0;
        return maxValue;
    }
}