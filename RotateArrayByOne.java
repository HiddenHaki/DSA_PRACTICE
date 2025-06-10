public class RotateArrayByOne {

    public static void main(String[] args) {
        RotateArrayByOne r = new RotateArrayByOne();
        int[] arr = {1, 2, 3, 4, 5};
        r.rotate(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int[] arr) {
        // code here
        int[] arr1 = new int[arr.length];
        arr1[0] = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            arr1[i + 1] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
    }
}
