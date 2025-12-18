class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstElem = strs[0];
        String lastElem = strs[strs.length - 1];
        int k = Math.min(firstElem.length(), lastElem.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) {
            if(firstElem.charAt(i) == lastElem.charAt(i)) {
                sb.append(firstElem.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}