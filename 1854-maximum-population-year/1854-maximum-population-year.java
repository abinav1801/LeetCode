class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearChanges = new int[101];
        for(int[] log: logs){
            yearChanges[log[0] - 1950]++;
            yearChanges[log[1] - 1950]--;
        }

        int maxPop = 0;
        int currPop = 0;
        int earlyYear = 1950;

        for(int i = 0; i < 101; i++){
            currPop += yearChanges[i];
            if(currPop > maxPop){
                maxPop = currPop;
                earlyYear = i + 1950;
            }
        }
        return earlyYear;
    }
}