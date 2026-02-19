class Solution {
    public int singleNumber(int[] nums) {
        int index = 0;
        for(int num:nums){
            index ^= num;
        }
        return index;
    }
}
/*
index = 0
        for num in nums:
            index ^= num
        return index
*/
        