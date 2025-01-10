// import java.util.*;
// public class rectangleStar {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for(int i = 1; i<=n ; i++){
//             for(int j = 1; j <= m ;j++){
//                 System.out.print("*");

//             }
//          System.out.println();
//         }
//     }
// }

//HOLLOW RECTANGLE..............

// public class rectangleStar{
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         for(int i = 1 ; i<= n; i++){
//             for(int j =1; j<=m; j++){
//                 if(i == 1 ||  j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }

//     }
// }

//HALF PYRAMID.................

// public class rectangleStar{
//     public static void main(String[] args) {
//         int  n = 5;
//         for(int i = 1; i<= n ; i++){
//             for(int j = 1; j<= i ; j++){
//               System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


//OPPOSITE PYRAMID............................
// public class rectangleStar{
//     public static void main(String[] args) {
//         int  n = 5;
//         for(int i = n; i>= 1 ; i--){
//             for(int j = 1; j<= i ; j++){
//               System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


//INVERTED HALF PYRAMID............................

// public class rectangleStar{
//     public static void main(String[] args) {

//         int n = 4;
       
//         for(int i = 1 ; i<= n; i++){
//             for(int j = 1; j<= n-i; j++){
//                 System.out.print(" ");

//             }
//             for(int j = 1; j <= i; j++){
//             System.out.print("*");
//             }
//             System.out.println();
//             }
//     }
// }


//PYRAMID WITH NUMBERS...............................
// public class rectangleStar{
//          public static void main(String[] args) {
    
//              int n = 4;
//             for(int i = 1; i<= n; i++){
//                 for(int j = 1; j<= i; j++){
//                     System.out.print(j);
//                 }
//                 System.out.println();
//             }
//          }
// }


//OPPOSITE NUMBER PYRAMID....................................

// public class rectangleStar{
//     public static void main(String[] args) {

//         int n = 5;
//        for(int i = 1; i<= n; i++){
//            for(int j = 1; j<=n- i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//     }
// }


//floyd's triangle........................

// public class rectangleStar{
//          public static void main(String[] args) {
    
//             int n = 5;
//             int number = 1;
//             for(int i = 1; i<= n ; i++){
//                 for(int j = 1; j <=i; j++){
//                     System.out.print(number+ " ");
//                     number++;
//                 }
//                 System.out.println();
//             }

//          }
//  }


// public class rectangleStar{
//     public static void main(String[] args) {

//        int n = 5;
//        for(int i = 1; i<= n; i++){
//            for(int j = 1; j<=i; j++){
//               int sum = i+j;
//               if(sum% 2==0){
//                 System.out.print("1");
//              }
//              else{
//                 System.out.print("0");
//              }
            
//         }
//         System.out.println();
//        }
//     }
// }


//BUTTERFLY PATTERN.......................

// public class rectangleStar{
//    public static void main(String[] args) {

//       int n = 4;
//       for(int i = 1; i<=n; i++){
//          for(int j =1; j<= i; j++){
//             System.out.print("*");
//          }
//          int gaps = 2*(n-i);
//           for(int j = 1; j<= gaps; j++){
//             System.out.print(" ");
//           }
//           for(int j = 1; j<= i; j++){
//             System.out.print("*");
//           }
//           System.out.println();
//       }
//       for(int i = n; i>=1; i--){
//          for(int j =1; j<= i; j++){
//             System.out.print("*");
//          }
//          int gaps = 2*(n-i);
//           for(int j = 1; j<= gaps; j++){
//             System.out.print(" ");
//           }
//           for(int j = 1; j<= i; j++){
//             System.out.print("*");
//           }
//           System.out.println();
//       }
      


      
//    }
// }

//ANOTHER PATTERN.....................

// public class rectangleStar{
//    public static void main(String[] args) {
//       int n = 5;
//       for(int i = 1; i<= n; i++){
//          for(int j =1; j<= n-i; j++){
//             System.out.print(" ");
//          }
//          for(int j = 1; j<=i; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//       for(int i = n; i>= 1; i--){
//          for(int j =1; j<= n-i; j++){
//             System.out.print(" ");
//          }
//          for(int j = 1; j<=i; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }

//    }
// }


//SOLID RHOMBUS.......................

// public class rectangleStar{
//    public static void main(String[] args) {
//       int n = 5;
//             for(int i = 1; i<= n; i++){
//                for(int j =1; j<= n-i; j++){
//                   System.out.print(" ");
//                }
//                for(int j = 1; j<=n; j++){
//                   System.out.print("*");
//                }
//                System.out.println();
//             }
//    }
// }


//HOLLOW RHOMBUS.......................

// public class rectangleStar{
//     public static void main(String[] args) {
//       int  n = 5;
//       for(int i = 1; i<= n; i++){
//          for(int j = 1; j<= n-i; j++){
//             System.out.print(" ");
//          }
//          for(int j =1; j<=n ; j++){
//             if(i == 1|| i == n || j == 1 || j ==n){
//                System.out.print("*");
//             }
//             else{
//                System.err.print(" ");
//             }
//             }
            
//          System.out.println();
//       }
//     }
//    }


// public class rectangleStar{
//      public static void main(String[] args) {
//       int n = 5;
//       for(int i = 1; i <= n; i++){
//          for(int j = 1; j<= n-i ; j++){
//             System.out.print( " ");
//          }
//          for(int j = 1; j<= i ; j++ ){
//          System.out.print( i + " ");
//          }
//          System.out.println();
//       }
//      }
//    }


//PALINDROMIC PATTERN.......................

// public class rectangleStar{
//    public static void main(String[] args) {
//     int n = 5;
//     for(int i = 1; i<=n; i++){
//       for(int j = 1; j<= n-i; j++){
//          System.out.print(" ");
//       }
//       for(int j = i; j>= 1; j--){
//          System.out.print(j);
//       }
//       for(int j = 2; j<= i; j++){
//          System.out.print(j);
//       }
//       System.out.println();
//     }
//    }
// }



//DIAMOND PATTERN....................

public class rectangleStar{
   public static void main(String[] args) {
    int n = 5;
    //UPPER CODE....
    
    for(int i = 1; i <= n; i++){
      for(int j = 1; j<= n-i; j++){
         System.out.print(" ");
      }
      for(int j = 1; j<= 2*i-1; j++){
         System.out.print("*");
      }
      System.out.println();
    }
    //LOWER CODE.......

    for(int i = n; i >= 1; i--){
      for(int j = 1; j<= n-i; j++){
         System.out.print(" ");
      }
      for(int j = 1; j<= 2*i-1; j++){
         System.out.print("*");
      }
      System.out.println();
    }
   
   }
}