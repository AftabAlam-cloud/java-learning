import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        int insort [] = new int[n];

        for(int i = 0; i< n; i++){
            insort[i] = sc.nextInt();
        }
        //sorting logic........
        for(int i = 1; i< n; i++){
            int key = insort[i];
            int j = i - 1;

            while(j >= 0 && key < insort[j]){
                insort[j+1] = insort[j];
                j--;
            }
            insort[j+1] = key;

        }
        System.out.println("Sorted element is:");
        for(int i = 0; i < n; i++){
            System.out.print(insort[i]+ " ");
        }


sc.close();
    }
    
}
