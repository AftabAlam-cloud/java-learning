import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int digit = sc.nextInt();
       
        while(digit != 0){
            sum += digit % 10;
            digit /= 10;
        }
        System.out.println("Sum of digit is" + "\t"  + sum);
        sc.close();
    }
}
