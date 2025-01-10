import java.util.Scanner;
public class bintoOctal {
    public static void main(String[] args) {
        //  int decimal = 0;
        //  int base = 1;

        //  String Octal = "";
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter binary  number :");
         String  binary = sc.nextLine();
     //WITHOUT USING METHOD......................
         //First change in decimal number........
        //  while(binary > 0 ){
        //     int lastdigit = binary% 10;
        //     decimal += lastdigit *base;
        //     base *= 2;
        //     binary /= 10;


        //  }
        //  System.out.println("decimal number is:" + decimal);

        //  while(decimal > 0) {
        //     int remainder = decimal % 8;
        //     Octal += remainder;
        //     decimal /= 8;
        int decimal = Integer.parseInt(binary , 2);

        System.out.println("Decimal number is:" + decimal);
        String Octal = Integer.toOctalString(decimal);

        //  }
         System.out.println("Octal number is :"  + Octal);
         sc.close();

    }
}
