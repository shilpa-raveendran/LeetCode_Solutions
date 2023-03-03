/* 
Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12". */


class Solution {
    public int compress(char[] chars) {
        int i=0;
        int n=chars.length;
        int j=0;
       
        while(i<n){

            int count=1;//minimumn count will be 1 for any character
            char prev=chars[i];

			// checks if chars[i]====chars[i+1], then count++
            while(i+1<n && chars[i]==chars[i+1]){
                count++;
                i++;
            }
			//if count is 1 then update the char at the jth index as prev and then increment j++;
            if(count==1){

                chars[j++]=prev;

            }
			//count > 1 then update the char at the jth index as prev and then increment j++
			// also add the next index .i.e j+1 with the count
            if(count>1){
                chars[j++]=prev;
                String countStr = Integer.toString(count);// convert the count as a string
                for(int x=0; x<countStr.length(); x++)
				{
					chars[j++]=countStr.charAt(x);//iterate through the countStr and add each character of the string to the chars array
                }
            }
            i++;
        }
        return j;
    }
}