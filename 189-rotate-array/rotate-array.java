class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int rotate = k%length;
        reverse(nums, 0, length-rotate-1);
        reverse(nums, length - rotate , nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}