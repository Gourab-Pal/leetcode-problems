class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstElem = strs[0];
        String lastElem = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Math.min(firstElem.length(), lastElem.length()); i++) {
            if(firstElem.charAt(i) == lastElem.charAt(i)) {
                sb.append(firstElem.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}