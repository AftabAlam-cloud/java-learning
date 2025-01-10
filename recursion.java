//sum of linear nunmber 1 to 10......

// public class recursion {
//     public static void sum(int i , int n , int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         sum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//        sum(1, 10, 0);
//     }
// }

public class recursion {
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int i = factorial(n-1);
        int factn = n * i;
        return factn;

    }
    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);
    }
}