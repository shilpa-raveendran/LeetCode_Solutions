/* 
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4 */

//Since the given array is sorted and we need the time complexity to be o(logn), thereffore we use Binary search

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0; int high=nums.length-1;

        while(low <= high){

            int mid=low+(high-low)/2;
            if( target == nums[mid]){
                return mid;
            }else if (target < nums[mid]) {

				high = mid - 1;

			} else if (target > nums[mid]) {

				low = mid + 1;

			}
        }
        return low;
    }
}
