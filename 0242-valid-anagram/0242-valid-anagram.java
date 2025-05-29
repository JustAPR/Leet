class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char k : t.toCharArray()) {
            if (!map.containsKey(k)) {
                return false;
            }
            if(map.containsKey(k) && map.get(k) <= 0){
                return false;
            }
            map.put(k, map.get(k) - 1);
        }
        return true;
    }
}