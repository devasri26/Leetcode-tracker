// Last updated: 7/9/2026, 9:16:20 AM

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            // Reduce prefix until it matches
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If no prefix left
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}