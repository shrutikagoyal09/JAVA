import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12,23,33,45,56,67,78,89,90};
        int target = 78;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

        }
        return -1;
    }
}
