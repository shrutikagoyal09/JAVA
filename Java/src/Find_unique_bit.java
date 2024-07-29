public class Find_unique_bit {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int ans = unique(arr);
        System.out.println(ans);
    }
    static int unique(int[] arr){
        int ans=0;
        for(int n: arr){
            ans = ans^n;
        }
        return ans;
    }
}
