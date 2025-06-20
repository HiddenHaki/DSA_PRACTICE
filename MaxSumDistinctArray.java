import java.util.*;

public class MaxSumDistinctArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5, 1};
        int k = 3;
        MaxSumDistinctArray obj = new MaxSumDistinctArray();
        long result = obj.maximumSubarraySum(nums, k);
        System.out.println("Maximum subarray sum of size " + k + " with distinct elements: " + result);
    }

    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int start = 0;
        long maxSum = 0, sum = 0;

        for (int end = 0; end < nums.length; end++) {

            while (hs.contains(nums[end])) {
                hs.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            hs.add(nums[end]);
            sum += nums[end];

            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                hs.remove(nums[start]);
                sum -= nums[start];
                start++;
            }

        }
        return maxSum;
    }
}
