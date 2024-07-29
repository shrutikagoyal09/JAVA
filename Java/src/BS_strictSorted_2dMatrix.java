import java.util.Arrays;

public class BS_strictSorted_2dMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] array = {
                {1},
                {3}
        };
        System.out.println(Arrays.toString(search(arr,12)));
        System.out.println(Arrays.toString(search(array,3)));
    }
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
       while(cStart <= cEnd){
           int mid = cStart + (cEnd-cStart)/2;
           if(matrix[row][mid] == target){
               return new int[]{row,mid};
           }
           else if(matrix[row][mid] < target){
               cStart = mid+1;
           }
           else{
               cEnd = mid-1;
           }
       }
       return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int cMid = cols/2;
        if(rows ==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        while(rStart < (rEnd-1)){
            int rMid = rStart + (rEnd-rStart)/2;
            if(matrix[rMid][cMid] == target){
                return new int[]{rMid,cMid};
            }
            else if(matrix[rMid][cMid] < target){
                rStart = rMid;
            }
            else{
                rEnd=rMid;
            }
        }

        if(matrix[rStart][0] == target){
            return new int[]{rStart,0};
        }
        else if(matrix[rEnd][0] == target){
            return new int[]{rEnd,0};
        }
        if(target > matrix[rStart][0] && target <  matrix[rEnd][0]){
            return binarySearch(matrix, rStart,0,cols-1,target );
        }
        else{
            return binarySearch(matrix, rEnd,0,cols-1,target );
        }
    }

}
