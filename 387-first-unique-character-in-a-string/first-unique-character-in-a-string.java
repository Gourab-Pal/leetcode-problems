class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map =new LinkedHashMap<>();
        int n = s.length();

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            int count = map.getOrDefault(c, 0);
            map.put(c, count+1);
        }

        // loop
        for(int j=0; j<n; j++) {
            char c = s.charAt(j);
            if(map.get(c)==1) return j;
        }

        return -1;
    }
}