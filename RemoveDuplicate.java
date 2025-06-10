public class RemoveDuplicate {

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] arr = {5,5,7,8,8,9,9,10,10};
        int newLength = rd.removeDuplicates(arr);
        System.out.println("New length: " + newLength);
    }

    public int removeDuplicates(int[] arr) {
        // Code Here
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[x]) {
                x++;
                arr[x] = arr[i];
            }
        }
        return x + 1;
    }
}