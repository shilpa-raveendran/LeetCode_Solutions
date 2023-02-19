/* Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]] 
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
*/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<Integer> nums1List = new ArrayList<>();
        List<Integer> nums2List = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>(2);

        //Add the two arrays to two sets
        HashSet<Integer> hs1= new HashSet<>();
        for(Integer i: nums1){
            
            if(!(hs1.contains(i))){
                hs1.add(i);
            }
        }

        HashSet<Integer> hs2= new HashSet<>();
        for(Integer i: nums2){
            
            if(!(hs2.contains(i))){
                hs2.add(i);
            }
        }

        //Check if hs1 elements are in hs2, 
        //and add the not present elemnts to the nums1 list
        for(Integer i: hs1){
            if(!(hs2.contains(i))){
                nums1List.add(i);
            }
        }
         //Check if hs2 elements are in hs1, 
        //and add the not present elemnts to the nums2 list
        for(Integer j: hs2){
            if(!(hs1.contains(j))){
                nums2List.add(j);
            }
        }

        //add to the answer list
        answer.add(nums1List);
        answer.add(nums2List);
        return answer;
    }
}
