class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int prefixSum = 0;

        for(int i=0; i<n; i++) {
            if(prefixSum<0) prefixSum=0;
            prefixSum = prefixSum + nums[i];
            maxSum = Math.max(prefixSum, maxSum);
        }

        return maxSum;
    }
}