class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return;
        k = k%n;
        if(k==0) return;
        int[] temp = new int[k];
        int j=0;
        for(int i=(n-k); i<n; i++) {
            temp[j] = nums[i];
            j++;
        }

        for(int i=n-1; i>=k; i--) {
            nums[i] = nums[i-k];
        }

        for(int a=0; a<k; a++) {
            nums[a] = temp[a];
        }
    }
}