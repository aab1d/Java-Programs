public class PatternDiamond {
    public static void main(String[] ar){
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = n-2 ; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i = n-1; i >= 0; i--){
            for(int j = n-2 ; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
