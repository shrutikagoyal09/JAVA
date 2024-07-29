import java.util.ArrayList;
import java.util.Collections;
public class K_factor {
    public static void main(String[] args) {
        int n=4;
        int k=4;
        int ans = kthFactor(n,k);
        System.out.println(ans);
    }
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    list.add(i);
                }
                else{
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        if(list.size() >=k){
            return list.get(k-1);
        }
        return -1;
    }
}
