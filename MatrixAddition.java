import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        int i,j,m,n,p,q;
        char choice;
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter the size of matrix A:");
            m = s.nextInt();
            n = s.nextInt();
            System.out.println("Enter the size of matrix B:");
            p = s.nextInt();
            q = s.nextInt();
            if (!(m == p && n == q)) {
                System.out.println("Addition not possible");
            }
            else {
                System.out.println("Enter elements for first matrix: ");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        a[i][j] = s.nextInt();
                    }
                }
                System.out.println("Enter elements for second matrix: ");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        b[i][j] = s.nextInt();
                    }
                }
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("The sum of matrix A and B is: ");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            System.out.println("Do you want to continue? (y/n)");
            choice = s.next().charAt(0);

        }while(choice != 'n');
    }
}
