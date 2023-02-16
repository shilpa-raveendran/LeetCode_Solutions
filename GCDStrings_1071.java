/* Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Input: str1 = "LEET", str2 = "CODE"
Output: "" */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
		//Chech if concating the two strings are equal to each other: i.e ABCABC+ABC == ABC+ABCABC == ABCABCABC
         if(!(str1 + str2).equals(str2+ str1)){
           return "";
        }else{
			
			//Finds the length of the gcd string
             int gcd= getgcd(str1.length(),str2.length());
			 
			 //returns the st1 after substring from index 0 to gcd
             return str1.substring(0,gcd);
        }
       
    }

    public int getgcd(int a, int b){
		// Euclid's theorem the algorithm replaces (a, b) by (b, a mod b) repeatedly until the pair is (d, 0), where d is the greatest common divisor.
		 if(!(b==0))  {
			 
			return getgcd(b, a%b);
		}
        return a;
    }
}