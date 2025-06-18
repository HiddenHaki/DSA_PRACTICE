public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int result = bs.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
    
    public int search(int[] nums, int target) {
        int start=0, end = nums.length-1;

        while(start<=end){
        int mid=(end+start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
}
