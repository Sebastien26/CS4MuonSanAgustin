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
    String response;
    int range = 10;
    int min = 1;
    int max;
    int guesses = 5;
    do{System.out.println("Welcome to Higher or Lower! What will you do?\n" + "-Start Game\n" + "-Change Settings" + "-End Application");
    response = sc.nextLine();
    switch(response){
        case "Start game":
    int random = (int) Math.floor(Math.random()*range) + min;
    for (int remaining == guesses; remaining>0; remaining--;){
    System.out.println("You have" + remaining + "guess(es) left. What's your guess?");
    int guess = sc.nextInt();
    if (guess == random){
         System.out.println("You got it!"); break;}
    else if (guess < random)
         System.out.println("Guess higher! You have " + guesses + " guess(es) left. What's your guess?");
     else if (guess > random)
         System.out.println("Guess lower! You have " + guesses + " guess(es) left. What's your guess?");}
        
    }
    while (response != "End Application")}
    






