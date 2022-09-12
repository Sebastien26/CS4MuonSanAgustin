/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Higher or Lower! What will you do?");
    System.out.println("-Start Game");
    System.out.println("-Change Settings");
    System.out.println("-End Application");
    String s1 = sc.nextLine();
    int guesses = 3;
    if(s1.equalsIgnoreCase("Start Game"))
    System.out.println("You have 3 guess(es) left. What's your guess?");
    int random = (int) Math.floor(Math.random()*10) + 1;
    int g = sc.nextInt();
    
    while (s1 != "End Application"){
    if (s1.equalsIgnoreCase("Start Game"))
        while (guesses > 0){
        for (int noOfGuesses = 3; noOfGuesses >= 0; noOfGuesses--)
            if (g < random)
            {System.out.println("Guess higher! You have " + guesses + " guess(es) left. What's your guess?"); break;}
            if (g > random)
            {System.out.println("Guess lower! You have " + guesses + " guess(es) left. What's your guess?"); break;}
            if (g == random)
            {System.out.println("You got it!"); break;}
                }
    }}
            }
    //while (g != random){
    //if (g > random)
    //System.out.println("Guess lower! You have" + guesses + "guess(es) left. What's your guess?");
    //if (g < random)
    //System.out.println("Guess higher! You have" + guesses + "guess(es) left. What's your guess?");
    //}}
    //}
    //}
