/* Input:
n=5 
k=3
stalls = [1 2 4 8 9]
Output: 3

Input:
n=5 
k=3
stalls = [10 1 2 7 5]
Output: 4 */

//Sort the array to use Binary search
//first write a function to place all the cows in the barn with given min distance; return true or false
//low and high can be any values;  here we are taking low=1 and high=stalls[n-1]
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=1; 
        int high=stalls[n-1];
        int ans=0;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(isPossible(stalls, n, k, mid)){
                ans=mid;//mid is a potential answer but not sure if its the maximum number , therefore low is updated.
				low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    
	//checks the position of all cows with min distance as minDist
	//Place the first cow in first position of the array  ie lastPlacedStall=a[0]
	//the start the loop from i=1, i.e. from the next stall and 
	//check if the distance between the current stall and lastPlacedStall >= minDist --> if so then cowsPlaced++ and update the lastPlacedStall
	//once cowsPlaced==cows; return true;

    public static boolean isPossible(int a[], int n, int cows, int minDist) {
        
        int cowsPlaced=1;
        int lastPlacedStall=a[0];
        
        for(int i=1 ; i< n ; i++){
            
            if(a[i]-lastPlacedStall >= minDist){
                cowsPlaced++;
                lastPlacedStall=a[i];
                
            }
             if(cowsPlaced == cows){
                return true;
            }
        }
       
        return false;
    }
}