class Solution {
    public int findGCD(int[] nums) {

        int smallest = nums[0];
        int largest = nums[0];

        // Find the smallest and largest elements
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < smallest) {
                smallest = nums[i];
            }

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Euclidean Algorithm
        while (smallest != 0 && largest != 0) {

            if (smallest > largest) {
                smallest = smallest % largest;
            } else {
                largest = largest % smallest;
            }
        }

        // Return the GCD
        if (smallest == 0) {
            return largest;
        } else {
            return smallest;
        }
    }
}