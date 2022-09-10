import java.util.Scanner;
public class WorkerEfficiency {
    public static void main(String[] ar){
        double jobTimeTaken;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter time taken to complete the job (Format XX.XX):");
        jobTimeTaken = s.nextDouble();
        if(jobTimeTaken >= 2 && jobTimeTaken <= 3){
            System.out.println("You are highly efficient. Great job!");
        }
        else if(jobTimeTaken > 3 && jobTimeTaken <= 4){
            System.out.println("You are good. But you need to improve further.");
        }
        else if(jobTimeTaken > 4 && jobTimeTaken <= 5){
            System.out.println("You are not up to the mark. You need training to improve your speed");
        }
        else if(jobTimeTaken > 5){
            System.out.println("Im afraid you are extremely inefficient, we can't work together.");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
