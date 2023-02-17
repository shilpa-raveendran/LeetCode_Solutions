class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        //Brute Force method

        //int i starts from 0 to nums.length; i++
        //int j starts from j=i+1 to nums.length; j++
        // if (nums[i]+nums[j]==target)
        //returns result[0]=i; result[1]=j

        int[] result = new int[2];

        for(int i = 0; i < nums.length ; i++){

             for(int j = i + 1; j < nums.length ; j++){

                 if(nums[i] + nums[j] == target){
                     result[0] = i;
                     result[1] = j ;
                 }
             }

         }

         return result;

        // Optimized Code
    
         HashMap<Integer, Integer> hm = new HashMap<>();
         for(int i = 0; i < nums.length ; i ++){
            
            //Check if the hm has the target-current i value ; initially the
            // hm will be empty therefore the first value is always added
             if(hm.containsKey(target - nums[i])){
                 //if present then set the result array
                  result[0] = i;
                  result[1] = hm.get(target - nums[i]) ;
                  return result;
             }
             hm.put(nums[i] ,i);
         }
        return result;

    }
}