class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            int count = sMap.getOrDefault(s.charAt(i), 0);
            sMap.put(s.charAt(i), count+1);
        }

        for(int i=0; i<n; i++) {
            int count = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), count+1);
        }

        for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();

            if(!tMap.containsKey(key)) return false;
            else {
                if(tMap.get(key) != val) return false;
            }
        }
        return true;
    }
}