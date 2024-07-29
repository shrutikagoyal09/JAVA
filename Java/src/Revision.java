import java.util.ArrayList;
import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
//        print(1);
//        print1(5);
//         int n =10;
//         for(int i=0; i<n; i++){
//             System.out.print(fibo(i) + " ");
//         }
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(binarySearch(arr,10,0,arr.length-1));
//        System.out.println(fact(5));
//        System.out.println(sumDigit(1234,0));
//        System.out.println(reverse(1234,0));
//        System.out.println(countZero(3004008,0));
//        int[] arr = {1,2,3,4,5,7,7,7,8,9};
//        System.out.println(sorted(arr,0));
//        System.out.println(linearSearch2(arr,7,0,new ArrayList<>()));
//        System.out.println(linearSearch3(arr,7,0));
//        pattern1(4,0);
//          pattern2(4,0);
        int[] arr = {5,4,3,2,1};

//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        bubbleSort2(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
//        selectionSort2(arr,arr.length-1,0,0);
//        System.out.println(Arrays.toString((arr)));
//        System.out.println(mergeSort(arr));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void print1(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }
    static int binarySearch(int[] arr,int target, int s, int e){
        if(s>e){
            return -1;
        }

        while(s<e){
           int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
               return binarySearch(arr,target,s,mid-1);
            }
            else if(arr[mid] < target){
               return binarySearch(arr,target,mid+1,e);
            }
        }
        return -1;
    }
    static int fact(int n){
        if(n==1){
            return n;
        }
        return n * fact(n-1);
    }
    static int sumDigit(int num, int sum){
        if(num ==0){
            return sum;
        }
        int digit = num%10;
        sum = sum+digit;
        return sumDigit(num/10,sum);
    }
    static int reverse(int num, int sum){
        if(num ==0){
            return sum;
        }
        int rem = num%10;
        sum = sum*10+rem;
        return reverse(num/10,sum);
    }
    static int countZero(int num, int count){
        if(num ==0){
            return count;
        }
        int rem = num%10;
        if(rem ==0){
            return countZero(num/10,count+1);
        }
        else{
            return countZero(num/10,count);
        }
    }

    static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && sorted(arr,i+1);
    }
    static int linearSearch(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else{
           return linearSearch(arr,target,i+1);
        }

    }


    static ArrayList<Integer> linearSearch2(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
           return linearSearch2(arr,target,i+1,list);


    }


    static ArrayList<Integer> linearSearch3(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> finallist = linearSearch3(arr,target,i+1);
       list.addAll(finallist);
       return list;



    }



    static void pattern1(int row, int col) {
        if (row == 0) {
            return;
        }

        if (row > col) {

            System.out.print("*");
            pattern1(row, col + 1);
        } else {

            System.out.println(" ");
            pattern1(row - 1, 0);
        }
    }


    static void pattern2(int row, int col){
        if(row == 0){
            return;
        }

       if(row>col){
           pattern2(row,col+1);
           System.out.print("*");

       }
       else{
           pattern2(row-1,0);
           System.out.println(" ");

       }

    }



    //Buuble sort - iteration

    static int[] bubbleSort(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    //Bubble sort - recursion

    static void bubbleSort2(int[] arr, int row, int col){
        if(row ==0){
            return;
        }
        if(row > col){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort2(arr, row , col+1);
        }
        else{
            bubbleSort2(arr, row-1 , 0);
        }
    }

   //selection sort - iteration
    static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length -i-1;
            int max = getMaxIndex(arr,0,last);
            if(arr[max] > arr[last]){
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
        return arr;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }



    static void selectionSort2(int[] arr, int row, int col,int max){
        if(row == 0){
            return;
        }
        if(row>col){
           if(arr[col] > arr[max]){
               selectionSort2(arr,row,col+1,col);
           }
        }
        else{
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;
            selectionSort2(arr, row-1,0,0);
        }
    }



    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);
    }

    static int[] merge(int[] first, int[] last){
        int[] mix = new int[first.length+last.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<last.length){
            if(first[i] < last[j]){
                mix[k] = first[i];
                i++;
                k++;
            }
            else{
                mix[k] = last[j];
                j++;
                k++;
            }
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<last.length){
            mix[k] = last[j];
            j++;
            k++;
        }

        return mix;
    }


    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s ==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }
            else{
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
