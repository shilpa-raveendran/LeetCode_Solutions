class Solution {
    public int singleNonDuplicate(int[] nums) {
        //uses BS for logn
       int low=0;
       int high=nums.length-1;
       int mid;

    // checking the boundary conditions
       if(nums.length==1){
           return nums[low];
       }else if (nums[low] != nums[low+1]){
            return nums[low];
       }else if(nums[high] != nums[high-1]){
            return nums[high];
       } 
       while(low <= high){

            mid= low+(high-low)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){

                return nums[mid];
            }

            //checking the index of the array, the index will always be odd  
            //and even for a pair untill the key element is found 
            //after that it will,be even and odd

            if( (mid % 2)==0 && nums[mid]==nums[mid+1] ||
                (mid % 2)==1 && nums[mid]==nums[mid-1]){

                    low=mid+1;
                    
                }else{

                    high=mid-1;
                }
       }
      
       return -1;
    }
}