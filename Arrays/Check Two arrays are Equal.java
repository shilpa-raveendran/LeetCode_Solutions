/* Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}


Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value. */



class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        
        //Adding each elements to a HM with its frequency
        HashMap<Long, Integer> hm= new HashMap<>();
        for(int i = 0 ; i< A.length ; i ++){
            
            
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }
        
        //Checking  if 2nd array elements are in HM 
        //then reduce its frequency else false
        for(int i = 0 ; i< B.length ; i ++){
            
            if(!(hm.containsKey(B[i]))){
                return false;
            }
            else{
                hm.replace(B[i], hm.get(B[i]) - 1);
            }
        }
        
        for (Map.Entry<Long, Integer> mapEntries :
             hm.entrySet()) {
 
            // fetching the values of the HashMap
            // one at a time and comparing with
            // the value to be checked
            if ((mapEntries.getValue() != 0))
                return false;
        }
        return true;
        
        // for (int i = 0; i < N; i++)
        //     if (A[i] != B[i])
        //         return false;
 
        // // If all elements were same.
        // return true;
        
    }
