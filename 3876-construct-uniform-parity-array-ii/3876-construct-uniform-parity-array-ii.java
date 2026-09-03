class Solution {
    public boolean uniformArray(int[] nums1) {
        int mn = Integer.MAX_VALUE;

        int oddCount = 0;
        for(int num : nums1){
            mn = Math.min(mn, num);
            if(num % 2 == 1) oddCount++;
        }

        return mn % 2 != 0 || oddCount == 0;
    }
}