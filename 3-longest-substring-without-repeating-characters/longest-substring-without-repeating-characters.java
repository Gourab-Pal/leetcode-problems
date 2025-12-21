class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        
        int start = 0;
        int end = 0;

        int maxLength = 0;

        while(end<n) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
            maxLength = Math.max(maxLength, set.size());
            
            
        }

        return maxLength;
    }
}