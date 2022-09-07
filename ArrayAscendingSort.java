import java.util.Scanner;

public class ArrayAscendingSort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        //Sorting in ascending order
        boolean swapped;
        for (int i = 0; i < size-1; i++) {
            swapped = false;
            for (int j = 0; j < size-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp =  arr[j];          //swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        for(int i = 0;  i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}