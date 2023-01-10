import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        int r = 1; //rock
        int p = 2; //paper
        int s = 3; //scissor
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter players choice: ");
        int p1 = sc.nextInt();
        Random random = new Random(); //import random numbers
        int c =random.nextInt(1,3); // from 1 to 3
        System.out.println("computers choice is: "+c);
        

        if(p1 == c)
        {
            System.out.println("Game is tie");
        }
        else
        {
            switch(p1)
            {
                case 1:
                if(c == p)
                {
                    System.out.println("you lose it was paper: ");
                }
                else
                {
                    System.out.println("you wins it was scissor: ");
                }
                break;

                case 2:
                if(c == r)
                {
                    System.out.println("you wins it was rock: ");
                }
                else
                {
                    System.out.println("you lose it was scissor: ");
                }
                break;

                case 3:
                if(c == r)
                {
                    System.out.println("you lose it was rock: ");
                }
                else 
                {
                    System.out.println("you win it was paper: ");
                }
                break;

            }
        }



        
        



    }

}
