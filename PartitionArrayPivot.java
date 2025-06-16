import java.util.*;
// LeetCode Problem: 2161. Partition Array According to Given Pivot

public class PartitionArrayPivot {

    public static void main(String[] args) {
        PartitionArrayPivot pap = new PartitionArrayPivot();
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] result = pap.pivotArray(nums, pivot);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int num:nums){
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        // Combine the results
        List<Integer> result = new ArrayList<>();
        result.addAll(less);
        result.addAll(equal);
        result.addAll(greater);

        // Convert the result back to an array
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }
}
