/* Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         if(n == 0){
                return true;
            }
        for(int i =0; i<= flowerbed.length-1 ; i++){
            if(flowerbed[i]==0 ){
                if((i==0 || flowerbed[i-1]==0) && (flowerbed.length-1 ==i ||flowerbed[i+1]==0)){
                   flowerbed[i]=1; 
                    n--;
                }
            }
            if(n == 0){
                return true;
            }
           
        }
         
        return false;
    }
}