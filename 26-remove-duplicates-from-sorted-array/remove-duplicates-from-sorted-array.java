class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;  // unique element index storing variable
        for(int j = 1; j < nums.length; j++){ 
            // travers throught the array and compare for the same element or differnt element
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}