public class PatternCross {
    public static void main(String[] ar){
        int n = 4;
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            if(i == n-1){
                System.out.println(" *");
                continue;
            }
            else System.out.print("*");
            for(int k = n-1; k > i; k--){
                System.out.print("    ");
            }
            System.out.println("*");
        }
        for(int i = n-2; i >= 0 ;i--){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            for(int k = n-1; k > i; k--){
                System.out.print("    ");
            }
            System.out.println("*");
        }
    }
}
