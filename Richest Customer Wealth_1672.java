class Solution {
    public int maximumWealth(int[][] accounts) {
        
        List<Integer> list= new ArrayList<>();
        for(int i= 0; i< accounts.length; i++){

            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            list.add(i,sum);
        }
        return Collections.max(list);
    }
}