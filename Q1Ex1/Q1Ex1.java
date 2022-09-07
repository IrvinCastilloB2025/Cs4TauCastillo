/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castillo_testproject;
import java.util.Scanner;

/**
 *
 * @author TAU
 */
public class Castillo_TestProject {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// header
		System.out.print("List of oc's that I may or may not regret making\n\n");

		// character 1
		String Name1 = "Zane";
		int Year1 = 2015;
		int Rating1 = 1;
		// char1 code
		System.out.print("Character 1\n");
		System.out.printf("Name: %s\n", Name1);
		System.out.printf("Year Created: %d\n", Year1);
		System.out.printf("Creator Rating: %d/10\n\n", Rating1);

		// character 2
		String Name2 = "Sam";
		int Year2 = 2019;
		int Rating2 = 9;
		// char2 code
		System.out.print("Character 2\n");
		System.out.printf("Name: %s\n", Name2);
		System.out.printf("Year Created: %d\n", Year2);
		System.out.printf("Creator Rating: %d/10\n\n", Rating2);

		// character 3
		String Name3 = "Unnamed";
		int Year3 = 2022;
		int Rating3 = 8;
		// char3 code
		System.out.print("Character 3\n");
		System.out.printf("Name: %s\n", Name3);
		System.out.printf("Year Created: %d\n", Year3);
		System.out.printf("Creator Rating: %d/10\n\n", Rating3);
		
		
		// observation declarations
		String Favorite = "PlaceHolder";
		String NewestName = "PlaceHolder";
		int NewestYear = 0;
		boolean Lie = ((Rating1 > Rating2) && (Rating1 > Rating3));//this indicates I like zane, it's a lie
		
		// observation code
		if((Rating1 > Rating2) && (Rating1 > Rating3)){
		    Favorite = Name1;
		}else if((Rating2 > Rating1) && (Rating2 > Rating3)){
		    Favorite = Name2;
		}else if((Rating3 > Rating2) && (Rating3 > Rating1)){
		    Favorite = Name3;
		}//checks ranking
        
		if((Year1 > Year2) && (Year1 > Year3)){
		    NewestName = Name1;
		    NewestYear = Year1;
		}else if((Year2 > Year1) && (Year2 > Year3)){
		    NewestName = Name2;
		    NewestYear = Year2;
		}else if((Year3 > Year2) && (Year3 > Year1)){
		    NewestName = Name3;
		    NewestYear = Year3;
		}//checks year
		
		
		// print observation
		System.out.print("Observations\n");
		System.out.printf("My favorite character is: %s\n", Favorite);
		System.out.printf("My newest character is: %s from %d\n", NewestName, NewestYear);
		if(Lie){
			System.out.printf("Character 1, %s, is my best character ever: true\n", Name1);
		} else {
		    System.out.printf("Character 1, %s, is my best character ever: false\n", Name1);
		}
	}
}
