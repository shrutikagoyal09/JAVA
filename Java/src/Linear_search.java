import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,35,23,6,77,45,78,55,245,64,9,7};
        int target = 5;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    public static int linearSearch(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target ){
                return i;
            }
        }
        return -1;
    }
}
