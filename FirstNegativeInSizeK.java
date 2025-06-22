import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInSizeK {
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, -5};
        int k = 3;
        FirstNegativeInSizeK obj = new FirstNegativeInSizeK();
        List<Integer> result = obj.firstNegInt(arr, k);
        System.out.println("First negative integers in each subarray of size " + k + ": " + result);
    }
    public List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i = 0, j = 0;

        List<Integer> neg = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (j < arr.length) {
            if (arr[j] < 0) {
                neg.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (neg.size() > 0) {
                    result.add(neg.get(0));
                } else {
                    result.add(0);
                }
                //before sliding, check if  arr[i] is equals to neg list's 0 index if equals remove it

                if (arr[i] < 0 && neg.size() > 0 && arr[i] == neg.get(0)) {
                    neg.remove(0);
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
