import java.util.Scanner;
public class decitooOctal {
    public static void main(String[] args) {

        //String octal = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number;");
        int decimal = sc.nextInt();
//WITHOUT USING METHOD..........................

        // while (decimal > 0){
        //     int remainder = decimal % 8;
        //     octal = remainder + octal;
        //     decimal = decimal / 8;
        // }

        //USING METHOD.................
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number is:" + octal);
    sc.close();
    }
    
}
