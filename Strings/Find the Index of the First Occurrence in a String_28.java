//Two Pointer

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

		//Check if the length of needle and haystack is same
		if (lengthOfNeedle == haystack.length()) {
			if (needle.equals(haystack)) {// if both are strings are equal then return 0 else -1
				return 0;

			} else {
				return -1;
			}
		//check if length of needle is greater than haystack
		} else if (lengthOfNeedle > haystack.length()) {
			return -1;
		}

		//if haystack contains needle then substring the haystack from the starting index to the length of needle
		//if checking each substring untill the first occurence is found
		while (haystack.contains(needle)) {
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
