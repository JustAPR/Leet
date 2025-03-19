class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left  = 0;
        int right;
        HashSet<Character> seen = new HashSet<Character>();
        int length = 0;

        for(right=0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(s.charAt(right));
            length = Math.max(length, right - left + 1);

        }
        return length;
    }
}