class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        if(s==null || n==0) return 0;
        int start = 0;
        int end = 0;
        while(end<n) {
            char c = s.charAt(end);
            if(!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, end-start+1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}