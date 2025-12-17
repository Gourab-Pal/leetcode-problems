class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int p1 = 0;
        int p2 = n-1;

        while(p1 < p2) {
            int water = (p2-p1)*Math.min(height[p1], height[p2]);
            maxWater = Math.max(water, maxWater);
            if(height[p1]<height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxWater;
    }
}