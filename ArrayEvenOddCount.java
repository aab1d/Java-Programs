import java.util.Scanner;

public class ArrayEvenOddCount {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int[] arr = new int[20];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array (<20): ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            }
            else oddCount++;
        }
        System.out.println("Even numbers: " + evenCount + " Odd numbers: " + oddCount);
    }
}
