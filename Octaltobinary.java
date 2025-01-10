import java.util.Scanner;
public class Octaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number :");
        String Octal = sc.nextLine();
        int decimal = Integer.parseInt(Octal , 8);
         String binary = Integer .toString(decimal);
         System.out.println("Binary number is;" + binary);
         sc.close();
      }
}
