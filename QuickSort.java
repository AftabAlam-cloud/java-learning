public class QuickSort {
    public static int partition (int arr[] , int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){

                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;


            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quicksort(int arr[] , int low , int high){
        if(low < high){
            int pi = partition(arr , low , high);
            quicksort(arr , low , pi - 1);
            quicksort(arr , pi +1 , high);

          }
    }
    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        quicksort(arr , 0 , arr.length - 1);

        System.out.println("Sorted array :");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
}
