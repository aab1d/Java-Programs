import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int i;
        char[] str = new char[20];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(i = 0; i < size; i++) {
            str[i] = s.next().charAt(0);
        }
        System.out.println("Enter the element you want to find: ");
        boolean flag = false;
        int element = s.next().charAt(0);
        for(i = 0; i < size; i++) {
            if(str[i] == element) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("The element is at position " + i);
        }
        else {
            System.out.println("The element is not present in the array.");
        }
    }
}
