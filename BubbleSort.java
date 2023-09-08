import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n =  sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorting Array using Bubble Sort Technique..\n");
        bubble(arr, n);
    }
    static void bubble(int arr[], int n){
        int didswap = 0;
        for(int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
        }
        System.out.print("Now the Array after Sorting is :\n");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+ "  ");
        }

    }
}
