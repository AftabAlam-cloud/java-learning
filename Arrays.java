import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:");
        int row = sc.nextInt();
        System.out.println("Enter column number:");
        int column = sc.nextInt();
        //array....
        System.out.println("input Number of 2D array is");

        int [][] numbers = new int[row][column];
       //input number in array.....
       
        for(int i = 0; i<row ; i++){
            for(int j = 0; j< column; j++){
                numbers[i][j] = sc.nextInt();
            
            }
        }
        System.out.println("Enter finding value of x:");
        int  x = sc.nextInt();

        for(int  i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                if(numbers[i][j] == x){
                    System.out.println("x value location is("+ i +" " + j+ ")" );
                }
            }
            
        }
        sc.close();

    }

}