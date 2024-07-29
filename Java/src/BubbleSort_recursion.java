import java.util.Arrays;
public class BubbleSort_recursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int row, int col){
        if(row == 0){
            return;
        }
        if(row>col) {
            if (arr[col] > arr[col+1]) {
                swap(arr, col, col + 1);
            }
            sort(arr, row, col + 1);
        }
        else{

                sort(arr, row-1, 0);
        }

    }
    static void swap(int[] arr, int col, int col2){
        int temp = arr[col];
        arr[col] = arr[col2];
        arr[col2] = temp;
    }
}
