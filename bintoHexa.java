import java.util.Scanner;
public class bintoHexa {
    public static void main(String[] args) {
        // int decimal = 0;
        // int base = 1;
        // String HexNum = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number:");
        String binary = sc.nextLine();
 // WITHOUT METHOD USING....................


        // while(binary > 0) {
        //       long lastdigit = binary % 10;
        //       decimal += lastdigit * base;  
        //       base *= 2;
        //       binary /= 10;
        // }
        


        // while (decimal > 0 ) {
        //   int remainder = decimal % 16;
        //   if(remainder < 10) {
        //     HexNum += remainder;
        //   }
        //   else{
        //     HexNum += (char) ('A'  + (remainder - 10));
        //   }
        //   decimal /= 10;

        // }

        //METHOD USING...............
      
        int decimal = Integer.parseInt(binary , 2);
        
        System.out.println("Decimal number is :" + decimal);

        String HexNum = Integer.toHexString(decimal);
        
        System.out.println("Hexadecimal is : " + HexNum.toUpperCase());
        sc.close();
    }
}
