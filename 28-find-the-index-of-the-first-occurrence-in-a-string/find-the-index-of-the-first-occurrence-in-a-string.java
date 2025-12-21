class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(n>h) return -1;
        
        for(int i=0; i<=(h-n); i++) {
            String sub = haystack.substring(i, i+n);
            if(sub.equals(needle)) return i;
        }

        return -1;
    }
}