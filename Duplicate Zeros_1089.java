class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        int[] arr2 = new int[arr.length + zeros];
        
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == 0){
                arr2[j] = 0;
                arr2[j+1] = 0;
                j++;
            }
            
            arr2[j] = arr[i];
            j++;
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr2[i];
        }
        
    }
    
}