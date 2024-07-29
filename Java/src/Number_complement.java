public class Number_complement {
    public static void main(String[] args) {
        int num = 2;
        int ans = findComplement(num);
        System.out.println(ans);
    }
    public static int findComplement(int num) {
        int rem =0;
        int n=0;
        while(num>0){
            rem = num%2;
            n = n*10+rem;
            num = num/2;
        }
        System.out.println(n);
        int r=0;
        int com=0;
        while(n>0){
            r = n%10;
            if(r==1){
                r=0;
            }
            else if(r==0){
                r =1;
            }
            com = com*10+r;
            n = n/10;
        }
        System.out.println(com);
        int dec =0;
        int base =0;
        int newrem =0;
        while(com>0){
            newrem = com%10;
            dec = dec+ newrem*((int)Math.pow(2,base));
            base++;
            com = com/10;
        }
        return dec;
    }
}
