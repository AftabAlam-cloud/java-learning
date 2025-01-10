import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size;");
        int n = sc.nextInt();
        int sorted[] = new int[n];

        System.out.println("enter the lement:");
        for(int i = 0; i< n; i++){
            sorted[i] = sc.nextInt();

        }
        //sorting code..........

        for(int i = 0; i< n -1; i++){
            int min = i;
            for(int j = i+1; j< n; j++){
                if(sorted[min] > sorted[j]){
                    min = j;
                }
            }
            int temp = sorted[min];
            sorted[min] = sorted[i];
            sorted[i] = temp;

        }
        System.out.println("Sorted array is ");
        for(int i = 0; i< n ; i++){
            System.out.print(sorted[i]+ " ");
        }
sc.close();
    }
}
