class Solution {
    public int expand(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;

        for(int i=0; i<n; i++) {
            int oddLen = expand(s, i, i);
            int evenLen = expand(s, i, i+1);
            int maxLen = Math.max(oddLen, evenLen);

            if(maxLen> (end-start)) {
                start = i - (maxLen-1)/2;
                end = i + maxLen/2;
            }
        }

        return s.substring(start, end+1);
    }
}