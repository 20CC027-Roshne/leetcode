class Solution {
public void sortColors(int[] nums) {
if(nums.length == 0) return ;

        quickSort(nums, 0, nums.length-1);
    
}

public void quickSort(int[] nums, int p, int r){
    if(p < r){
        int q = partition(nums, p, r);
        quickSort(nums, p, q-1);
        quickSort(nums, q+1, r);
    }
    
}
    
public int partition(int[] nums, int p, int r){
    int x = nums[r];
    int i = p - 1;
    int tmp;
    for(int j = p; j < r; j++){
        if(nums[j] <= x){
            i++;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
    tmp = nums[i+1];
    nums[i+1] = nums[r];
    nums[r] = tmp;
    return i+1;
} 
}
