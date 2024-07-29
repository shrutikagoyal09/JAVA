import java.util.Arrays;
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++ ){
            int last = arr.length-i-1;
            int max = getMaxElem(arr, 0,last);

                if(arr[max] > arr[last] ){
                    int temp = arr[max];
                    arr[max] = arr[last];
                    arr[last] = temp;
                }

        }
    }
    public static int getMaxElem(int[] arr, int start, int end){
        int max_index = start;
        for(int i=start; i<end; i++){
            if(arr[max_index] < arr[i] ){
                max_index = arr[i];
            }
        }
        return max_index;
    }
}
