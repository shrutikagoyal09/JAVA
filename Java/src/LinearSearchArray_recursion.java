import java.util.ArrayList;
public class LinearSearchArray_recursion {
    public static void main(String[] args) {
        int[] arr = {1,5,3,3,7,2,9};
        int target = 3;
        System.out.println(search(arr,target,0));
        System.out.println(searchIndex(arr,target,0));
        System.out.println(searchLastIndex(arr,target,arr.length-1));
        searchAllIndex(arr,target,0);
        System.out.println(list);

        System.out.println(searchAllIndex2(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndex3(arr,target,0));
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }


    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return searchIndex(arr,target,index+1);
        }

    }

    static int searchLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return searchLastIndex(arr,target,index-1);
        }

    }


   static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }

        searchAllIndex(arr,target,index+1);


    }



    static ArrayList<Integer> searchAllIndex2(int[] arr, int target, int index,  ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return searchAllIndex2(arr,target,index+1, list);


    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr , target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }



}
