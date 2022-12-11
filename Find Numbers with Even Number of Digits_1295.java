class Solution {
    public int findNumbers(int[] nums) {
        
        int finalCount=0;
        for(int no :nums){
            int noOfDigits=0;
            while(no != 0){
                no= no/10;
                noOfDigits++;
            }
            if(noOfDigits % 2==0){
                finalCount++;
            }
        }
        return finalCount;
    }
}