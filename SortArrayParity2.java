public class SortArrayParity2 {

    public static void main(String[] args) {
        SortArrayParity2 sap = new SortArrayParity2();
        int[] nums = {4, 2, 5, 7};
        int[] sorted = sap.sortArrayByParityII(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }

    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIdx] = nums[i];
                evenIdx += 2;
            } else {
                result[oddIdx] = nums[i];
                oddIdx += 2;
            }
        }
        return result;
    }
}
