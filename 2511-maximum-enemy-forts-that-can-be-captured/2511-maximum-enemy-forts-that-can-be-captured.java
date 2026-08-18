class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int previous = -1;

        for(int i = 0 ; i < forts.length; i++){
            if(forts[i] != 0){
                if(previous != -1 && forts[i] != forts[previous]){
                    max = Math.max(max, i - previous - 1);
                }
                previous = i;
            }
        }
        return max;
    }
}