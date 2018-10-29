import java.util.Scanner;

/**
 * Write a description of class Nim here.
 *
 * @author (Liz and Amy)
 * @version (10/23/17)
 */
public class NimOne
{
   static Scanner in = new Scanner(System.in);
   static int countStick;
   static int leftStick;
   static int stickNumber;
    
   public static void main() {
        System.out.println("Hey! How many sticks would you want to start with?");
        stickNumber = in.nextInt();
        numberStick(stickNumber); //print out the number of sticks chosen
        System.out.println("");
        
        System.out.print("Player 1 removes how many sticks? ");
        int input = in.nextInt();
        removeStick(input);
        
        while (countStick != 1){
           System.out.print("Player 2 removes how many sticks? ");
           input = in.nextInt();
           leftStick(input); // refers to the method to remove sticks   
           //If the remaining number of sticks is greater than 1, then game continues
           if (countStick > 1) {
               System.out.print("Player 1 removes how many sticks? "); 
               input = in.nextInt();
               leftStick(input);
               //Then the player who removes the last stick lost
               if (countStick == 1){
                   System.out.println("Play 2 lost!");
               }
                   
           } else if (countStick == 1){
               System.out.println("Play 1 lost!");
           } 
        }
    }
    
   //Method for setting up the number of sticks
   public static int numberStick(int stickNumber){
        
        for (int i = 0; i <= stickNumber - 1; i++){
            System.out.print("|");
        }
        return stickNumber;
   }
    
   //Method for the first round to remove sticks
   public static int removeStick(int input) {
       countStick = 0;
       for (int i = 0; i<=(stickNumber- 1 - input); i++){
           System.out.print("|");
           countStick++;
        }
       System.out.println("");
       return countStick;
    }
    
    //General method to remove sticks
   public static int leftStick(int input) {
        leftStick = countStick;
        countStick = 0; 
        //countstick counts the number of sticks print out this round
        //leftstick is the number of sticks print out last round
        for (int i = 0; i <=(leftStick - 1 - input); i++){
            System.out.print("|");
            countStick++;
        }
        System.out.println("");
        return countStick;
   }
   
   public static int RemoveStick(int input) {
        leftStick = countStick;
        countStick = 0; 
        //countstick counts the number of sticks print out this round
        //leftstick is the number of sticks print out last round
        for (int i = 0; i <=(leftStick - 1 - input); i++){
            System.out.print("|");
            countStick++;
        }
        System.out.println("");
        return countStick;
   }
}
