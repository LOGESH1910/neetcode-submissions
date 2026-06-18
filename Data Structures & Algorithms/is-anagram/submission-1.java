class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // for 'a' to 'z'

        // Count for s and t in one loop
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // increase for s
            count[t.charAt(i) - 'a']--;  // decrease for t
        }

        // If all counts are zero, it's an anagram
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
