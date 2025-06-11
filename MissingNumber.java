public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {3, 0, 1};
        int missing = mn.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int orgSum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return orgSum - sum;
    }
}
