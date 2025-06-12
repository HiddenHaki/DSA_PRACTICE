public class RotateArrayByD {

    public static void main(String[] args) {
        RotateArrayByD rabd = new RotateArrayByD();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rabd.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums, 0, n - 1); // reverse whole array
        reverse(nums, 0, k - 1);// reverse first k elements
        reverse(nums, k, n - 1);// reverse remaining ele.

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
