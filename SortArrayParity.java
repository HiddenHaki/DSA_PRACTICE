public class SortArrayParity {


    public static void main(String[] args) {
        SortArrayParity sap = new SortArrayParity();
        int[] nums = {4, 2, 5, 7, 8, 10, 3, 1};
        int[] sorted = sap.sortArrayByParity(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
    
    public int[] sortArrayByParity(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
                x++;
            }
        }
        return nums;
    }
}
