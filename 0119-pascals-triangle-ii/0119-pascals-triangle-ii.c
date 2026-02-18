/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize) {
    *returnSize = rowIndex + 1;
    int* result = (int*)malloc((*returnSize) * sizeof(int));
    
    result[0] = 1;
    
    for (int i = 1; i <= rowIndex; i++) {
        for (int j = i; j > 0; j--) {
            if (j == i) {
                result[j] = 1;
            } else {
                result[j] = result[j] + result[j-1];
            }
        }
    }
    
    return result;
}