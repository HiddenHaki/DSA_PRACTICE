public class ArraySortedRotated {

    public static void main(String[] args) {
        ArraySortedRotated asr = new ArraySortedRotated();
        int[] nums = {3, 4, 5, 1, 2};
        boolean result = asr.check(nums);
        System.out.println("Is the array sorted and rotated? " + result);
    }

    public boolean check(int[] nums) {
        int peak = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                peak++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            peak++;
        }
        return peak <= 1;
    }
}
