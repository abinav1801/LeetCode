class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - k - 1); // This is to rotate the 1 2 -> 2 1
        reverse(arr, n - k, n - 1); //This is to rotate the 3 4 5 - > 5 4 3
        reverse(arr, 0, n - 1);// The final array 2 1 5 4 3 -> 3 4 5 1 2
    }

    public void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}