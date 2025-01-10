import java.util.Scanner;
public class hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String hexaNum = "";
        System.out.println("Enter the decimal number:");
        int num = sc.nextInt();
  
  
        //WITHOUT USING HEXA METHOD..........................

        // while(num > 0 ){
        //   int remainder = num % 16;

        //   if(remainder < 10){
        //     hexaNum = remainder + hexaNum;
            
        //   }
        //   else{
        //     hexaNum = (char) ('A' + (remainder - 10)) + hexaNum;

        //   }
        //   num = num / 16;
        // }
 
        //USING HEXA METHOD.................................

        String hexaNum = Integer. toHexString(num);


        System.out.println("HexNum is :" + hexaNum.toUpperCase());

        sc.close();
    }
   
    
}