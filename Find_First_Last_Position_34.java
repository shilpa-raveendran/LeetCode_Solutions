/*Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int result[] = {-1,-1};
		int low = 0;
		int high = nums.length - 1;
		if (nums.length == 0) {
			return result;

		}
		result[0] = start(nums, target, low, high);
		result[1] = end(nums, target, low, high);

		return result;

    }
    private static int end(int[] nums, int target, int low, int high) {

		int mid;
		int end = -1;
		while (low <= high) {
			mid = low + (high - low) / 2;

			//we need to find the last pos
			//update the low=mid+1
			if (nums[mid] == target) {
				end = mid;
				low = mid + 1;

			//this means the target isnt in this side of the  array
			//therefore update the low=mid+1

			} else if (nums[mid] < target) {
				low = mid + 1;

			//here nums[mid] > target 
			//this means the target lies b/w low and mid
			//therefore high=mid-1
			} else {
				high = mid - 1;
			}
		}
		return end;
	}

	public static int start(int[] nums, int target, int low, int high) {
		int mid;
		int start = -1;//default -1

		while (low <= high) {
			mid = low + (high - low) / 2;

			//first occurence is in left part
			//therefore the high is reduced to mid-1 and assign start=mid
			if (nums[mid] == target) { 
				start = mid;
				high = mid - 1;

			//this means the target isnt in this side of the  array
			//therefore update the low=mid+1
			} else if (nums[mid] < target) {
				low = mid + 1;

			//here nums[mid] > target 
			//this means the target lies b/w low and mid
			//therefore high=mid-1
			} else {
				high = mid - 1;
			}
		}
		return start;
	}

    
}