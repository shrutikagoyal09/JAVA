import java.util.Scanner;
public class Square_root {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to find square root of: ");
        int n = input.nextInt();
        System.out.println("The square root of " + n + " is " + sqrt(n));

    }
    static double sqrt(int n){
        double root =0.0;
        int start =1;
        int end =n;
        while(start <= end){
            int m = start +(end-start)/2;
            if(m*m == n){
               return m;
            }
            else if( m*m > n){
                end = m-1;
            }
            else{
                start = m+1;

            }
        }
        double inc = 0.1;
        for(int i=0; i<3; i++){

            while(root*root <=n){

                root = root+inc;

            }
            root = root-inc;
            inc=inc/10;
        }
        return root;
    }
}
