import java.util.Arrays;
public class Cycle_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr){
        int start =0;
        int end = arr.length;
        while(start < end){
            int correct = arr[start]-1;
            if(correct == start){
                start++;

            }
            else{
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            }
        }
    }
}
