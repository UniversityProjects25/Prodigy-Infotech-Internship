import java.util.Scanner;
import java.util.Random;
public class Task_2_Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rannum = random.nextInt(99) + 1;
        System.out.println("Enter the Guess Number");
        int t=0;
        int attempt=0;

        while(rannum != t){

            t=sc.nextInt();
            attempt = attempt+1;

            if(t>rannum){
                System.out.println("Guess Number is higher then Random number. Guess again! ");

            }
            else if(t<rannum){
                System.out.println("Guess Number is Lesser then Random number. Guess again! ");
            }
            else{
                System.out.println("Guess Number is Equal to Random number.  ");
                System.out.println("You Won! ");
                break;
            }
        }
        System.out.println("Number of Attempts: " + attempt);


    }
}





















