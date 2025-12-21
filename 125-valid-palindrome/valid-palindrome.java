class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if(s.length()==0) return true;

        int n = s.length();

        int p1 = 0;
        int p2 = n-1;

        while(p1<p2) {
            if(s.charAt(p1) != s.charAt(p2)) return false;
            else {
                p1++;
                p2--;
            }
        }

        return true;
    }
}