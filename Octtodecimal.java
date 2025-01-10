import java.util.Scanner;
public class Octtodecimal {
    public static void main(String[] args) {
        // int decimal = 0;
        // int base  = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Octsal number:");

        String Octal = sc.nextLine();
//WITHOUT MEHTOD USING...........................

        // while(Octal > 0) {
        //     int lastdigit = Octal % 10;
        //     decimal += lastdigit *base;
        //     base *= 8;
        //     Octal /= 10;
        // }
       int decimal = Integer.parseInt(Octal , 8);

        System.out.println("Decimal number is:" + decimal);
        sc.close();
    }

    
}
