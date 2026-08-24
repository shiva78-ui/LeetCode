class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int temp[] = new int[k];

        // Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }

        // Shift remaining elements to the right
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Put temp elements at the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}