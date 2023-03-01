/* Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1. */

class Solution {
    public int strStr(String haystack, String needle) {
        int low = 0;
		int lengthOfNeedle = needle.length();
		while(haystack.contains(needle)) {
			String newStr = haystack.substring(low, lengthOfNeedle);
			if (newStr.equals(needle)) {
				return low;
			} else {
				low++;
                lengthOfNeedle++;
			}
			
		}

		return -1;
    }
}