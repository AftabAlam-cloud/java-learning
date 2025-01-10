// public class fibonacci {
//     public static void fibo(int a  , int b , int n){
//         if(n==0){
//             return;
//         }
//         int c = a+ b;
//         System.out.println(c);
//         fibo(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 8;
//         fibo(a, b, n-2);
//     }
// }

public class fibonacci {
    public static int power(int x , int n){
        if(x==0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int powNm = power(x, n -1);
        int xpower = powNm * x;
        return xpower;
    }
    public static void main(String[] args) {
        int x= 2 , n = 5;
        int ans = power(x, n);
        System.out.println(ans);
    }
}