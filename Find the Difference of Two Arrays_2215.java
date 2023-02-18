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