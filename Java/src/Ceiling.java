import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12,23,33,45,56,67,78,89,90};
        int target = 11;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //to find the smallest number greater than or equal to target.
    public static int ceiling(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        if(nums[end] < target){
            return -1;
        }
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
        return start;
    }
}
