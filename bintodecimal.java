import java.util.Scanner;
public class bintodecimal {
    public static void main(String[] args) {
        
    //WITHOUT USING METHOD..................

    // int decimal = 0;
    // int base  = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter binary number: ");
    String binary = sc.nextLine();
    
    // while(binary > 0 ){
    //     long lastdigit  = binary % 10;
    //     decimal += lastdigit *base;
    //     base *= 2;
    //     binary /= 10;
    // }
//USING METHOD...............................
    int decimal = Integer.parseInt(binary , 2);

    

    System.out.println("Decimal num is:" + decimal);
sc.close();
}
}