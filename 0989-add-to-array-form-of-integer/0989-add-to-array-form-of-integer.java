class Solution {
    public List<Integer> addToArrayForm(int[] arr, int num) {
        List<Integer> result = new ArrayList<>();
        int size = arr.length - 1;
        while(size >= 0 || num > 0){
            if(size >= 0){
                num += arr[size];
            }

            result.add(0,num % 10);
            num /= 10;
            size--;
        }
        return result;
    }
}