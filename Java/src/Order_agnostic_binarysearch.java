import java.util.Scanner;
import java.util.Arrays;
public class Order_agnostic_binarysearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target: ");
        int target = input.nextInt();

        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    public static int binarysearch(int[] nums, int target){
        int start =0;
        int end = nums.length -1;
        if(nums[start] < nums[end]){
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
        }
        else{
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if(nums[mid] > target){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
