/*Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".*/

class Solution {
    public String removeStars(String s) {
        //Using Stack

        // Stack<Character> stack= new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(c != '*'){
        //         stack.push(c);
        //     }else{
        //         //if(c == '*' &&)
        //         stack.pop();
        //     }
        // }
        // StringBuilder res = new StringBuilder();
        // while(!stack.isEmpty()){
        //     res.append(stack.pop());
        // }
        // return res.reverse().toString();

        // Using Array

        //Create an array to store the result
        char[] arr= new char[s.length()];
        int index=0;
        for(char c : s.toCharArray()){
            if(c != '*'){
                //store the c to array and increment index
                arr[index++]=c;
            }else{
                index--;
            }
        }
        return new String(arr,0, index);
    }
}
