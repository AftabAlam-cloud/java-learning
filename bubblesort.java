import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     //Taking user input....................

     System.out.print("Enter array size");
    int num = sc.nextInt();
//TAKING ELEMR FOR SORT...............

    System.out.print("Enter array element:");

    int sortNum []= new int[num];
    for(int i = 0; i<num; i++ ){
        sortNum[i] = sc.nextInt();

    } 
    //SORTING LOGIC......................

    for(int i = 0; i< num; i++){
        for(int j = 0; j<num-i-1; j++){
            if(sortNum[j] > sortNum[j+1]){
                int temp = sortNum[j];
                sortNum[j] = sortNum[j+1];
                sortNum[j+1] = temp;
            }
            
        }
    }
    //PRINT THE SORTED ELEMENT..............
    
    System.out.println("Bubble sorted array is:");
    for(int i = 0; i< num; i++){
        System.out.print( sortNum[i] + " ");
    }
    sc.close();
}
}
