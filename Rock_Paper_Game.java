

import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 0 for scissor,1 for Rock,2 for paper");
        int user_input = s.nextInt();
        Random random = new Random();
        int computer_input = random.nextInt(3);
        if (user_input == computer_input){
            System.out.println("Draw");
        } else if (user_input==1 && computer_input==0 ||user_input==0 && computer_input==2 || user_input==2 && computer_input==1){
            System.out.println("You Win");
        } else if (computer_input==0 && user_input==2 || computer_input==1 && user_input==0 || computer_input==2 && user_input==1) {
            System.out.println("Computer Win");

        }
        System.out.println("computer choice is: " + computer_input);



    }
}
