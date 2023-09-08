import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n =  sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorting Array using Selection Sort Technique..\n");
        selection(arr, n);

    }
    static void selection (int arr[], int n){
        for(int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.print("Now the Array after Sorting is :\n");
        for(int f=0; f<n; f++)
        {
            System.out.print(arr[f]+ "  ");
        }

    }
}
