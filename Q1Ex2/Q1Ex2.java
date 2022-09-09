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
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        step 1: make starting screen
        step 2: make input taker
        step 3: create rng'
        step 4: right or wrong
        */
        
        StartingScreen();
    }
    //step 1: starting screen
    static void StartingScreen(){
        System.out.print("\n\n\n");
        System.out.print("Welcome to Higher or Lower! What will you do\n");
        System.out.print("-Start game\n");
        System.out.print("-Change settings\n");
        System.out.print("-End application\n");
    }
    //step 2: input
    static String Input(String Input){
        Scanner sc = new Scanner(System.in);//player input
        Input = sc.nextLine();
        return Input;
    }
}

