import java.util.*;

class Rangame
{
    int generateRandomIntIntRange(int min, int max) 
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

public static void main (String args[])
{
    Rangame r1=new Rangame();
    Scanner s=new Scanner(System.in);
   
    int guess;
    char choice;
   
    do
    {
        try
        {
            System.out.println("\n\nGuess the number\n");
            guess = s.nextInt();
            int l= r1.generateRandomIntIntRange(1,3);
            if(guess==l)
            {
                System.out.println("You got it!!!!");
            }
            else
            {
                System.out.println("Sorry!!! try your luck again");
                System.out.println("The number is: "+l);
            }
    
        }
        catch(InputMismatchException e)
        { 
               System.out.println("Invalide input!!!");
               //break;
               //continue;
        } 
        finally{
        System.out.print("\nWant to play again. Enter Y for yes or N for no: ");
        choice = s.next().charAt(0);
        }
        
    }
    while ((choice == 'y') || (choice == 'Y'));
}
}