public class MaxConsecutivesOnes {

    public static void main(String[] args) {
        MaxConsecutivesOnes mco = new MaxConsecutivesOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxCount = mco.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxCount);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
