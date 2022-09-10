/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
import java.util.Scanner;

/**
 *
 * @author TAU
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    
    /*
        step 0: declare variables
        step 1: make starting screen
        step 2: make input
        step 3: make game start
        step 4: make game settings
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //step 0: declare variables
        int Min = 1;
        int Max = 10;
        int Tries = 5;
        
        
        StartScreen(Min, Max, Tries);
    }
    
    
    
    
    
    //METHODS
    //step 1: make starting screen
    static void StartScreen(int Min, int Max, int Tries){
        System.out.print("\n\n\n");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Welcome to Higher or Lower! What will you do\n");
        System.out.print("-Start\n");
        System.out.print("-Settings\n");
        System.out.print("-End\n");
        Scanner sc = new Scanner(System.in);//player input
        
        
        //step 2: make input
        String Input = sc.nextLine();
        switch (Input) {
            case "Start":
            case "start":
                //start game
                System.out.print("\n\n\n");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                Game(Min, Max, Tries);
                break;
                
            case "Settings":
            case "settings":
                //go to settings
                System.out.print("\n\n\n");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                Settings(Min, Max, Tries);
                break;
                
            case "End":
            case "end":
                //end application
                System.out.print("application ended\n");
                break;
                
            default:
                //error
                System.out.print("Sorry, I didn't catch that\npress enter to continue");
                sc.nextLine();
                System.out.print("\n\n\n");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                StartScreen(Min, Max, Tries);
        }
    }
    
    
    
    
    //step 3: game start
    static void Game(int Min, int Max, int Tries){        
        int Num = (int) Math.floor(Math.random()*Max) + Min;
        Scanner sc = new Scanner(System.in);//player input
        int TriesTemp = Tries;//replaces Tries
        int GuessNum;
        String Guess;//Backup for when the player accidentally enters a string 
        
        System.out.print("What is your name?\n");
        String Name = sc.nextLine();
        //-it's a surprise tool that will help us later.
        
        System.out.print("\n\n\n");
        System.out.print("\033[H\033[2J");
        
        while(TriesTemp > 0){
            //guesses left and range
            if(TriesTemp > 2){
                System.out.printf("You have %s guesses left. A random number from %d to %d ? ", TriesTemp, Min, Max);
            } else if(TriesTemp > 1){
                System.out.printf("You have, uh oh, %s guesses left! A random number from %d to %d ? ", TriesTemp, Min, Max);
            } else {
                //funny
                System.out.printf("\nYou have %s guess left. Last chance buddy, it's been fun.\n\nGosh, I remember when you had %d guesses.\nWow, uhm, wow that feels so long ago now, haha, well.\nSorry I just get so emotional during these parts you know?\nI mean this was going to happen eventually so I don't even know why I'm crying.\nIt's just, I don't know we've been stuck here together, you trying your best and me helping you out.\nI just feel like we've grown a certain bond, don't you, %s?\n\n", TriesTemp, Tries, Name);
                sc.nextLine();
                System.out.printf("\nHeh, well... A random number from %d to %d ? ", Min, Max);
            }
            Guess = sc.nextLine();//guess
            
            
            //to avoid entering non integers
            try{
                GuessNum = Integer.valueOf(Guess);
            }
            catch(Exception NotNumber){
                System.out.print("That's not a number, silly.\n\n");
                continue;
            }
            
            
            //to avoid going beyond range
            if(GuessNum > Max){
                System.out.print("That's way too high!\n\n");
                continue;
            } else if(GuessNum < Min){
                System.out.print("That's way too low!\n\n");
                continue;
            }
            
            
            //too high or too low or correct
            if(GuessNum > Num){
                System.out.print("Too high!\n\n");
            } else if(GuessNum < Num){
                System.out.print("Too low!\n\n");
            } else {
                System.out.print("\nWOOOOO YOU GOT IT\n\n");
                break;
            }
            TriesTemp--;
        }
        System.out.print("<press enter to continue>");
        sc.nextLine();
        
        String YorN;//play again yes or no
        do {
            System.out.print("\n\n\n");
            System.out.print("\033[H\033[2J");
            System.out.print("Play again?\n");
            YorN = sc.nextLine();
            switch (YorN){
                case "yes": 
                case "Yes":   
                    //play again
                    System.out.print("\n\n\n");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Game(Min, Max, Tries);
                    break;
                
                case "no": 
                case "No":
                    //exit
                    System.out.print("\n\n\n");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                
                default:
                    //error
                    System.out.print("\n\n\n");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Sorry, I didn't catch that\npress enter to continue");
                    sc.nextLine();
                    continue;
            }
            break;
        } while (!"yes".equals(YorN) || !"Yes".equals(YorN) || !"no".equals(YorN) || !"No".equals(YorN));
        
        
        //return to start screen
        StartScreen(Min, Max, Tries);
    }
    
    //step 4: game settings
    static void Settings(int Min, int Max, int Tries){
        System.out.print("\n\n\n");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);//player input

        
        int success;//error counter
        do{
            System.out.print("\n\n\n");
            System.out.print("\033[H\033[2J");
            System.out.flush();
           
            System.out.print("GAME SETTINGS\n");
            System.out.print("What is the lower limit of the random number? - ");
            String MinTemp = sc.nextLine();//to be translated to int
        
            System.out.print("What is the upper limit of the random number? - ");
            String MaxTemp = sc.nextLine();//to be translated to int
            
            System.out.print("How many guesses are allowed? - ");
            String TriesTemp = sc.nextLine();//to be translated to int 
            
            
            //to check for non-integers
            success = 0;
            try{
                Min = Integer.valueOf(MinTemp);
                success++;
            }
            catch(Exception NotNumber){
                System.out.print("\nLower limit is not a number.\n");
            }
            try{
                Max = Integer.valueOf(MaxTemp);
                success++;
            }
            catch(Exception NotNumber){
                System.out.print("Upper limit is not a number.\n");
            }
            try{
                Tries = Integer.valueOf(TriesTemp);
                success++;
            }
            catch(Exception NotNumber){
                System.out.print("Number of guesses is not a number.\n");
            }
            
            
            //to check if upper limit is higher than lower limit
            if (success == 3){
                if (Max > Min){
                    success++;
                } else {
                    System.out.print("\nUpper limit should be higher than Lower limit.\n");
                }
            }
            sc.nextLine();
        } while (success != 4);
        
        //go back to starting screen
        StartScreen(Min, Max, Tries);
    }
}
