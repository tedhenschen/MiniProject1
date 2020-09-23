/*
 Mini Project 1
Group #5: Ted Henschen, Mengying Yu, Tyler Adleta, Damon Nicholas
Date: 9/23/2020
*/

//Import necessary Java Utilities
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  
  //Implement Scanner s
  Scanner s = new Scanner(System.in);
  //Implement Random r
  Random r = new Random();

 //Introduce User to game
  System.out.println("Welcome to the guessing game!");

  //Ask User for a number to create guess range
  System.out.println("Please enter any positive whole number:");
  //Store user Input
  int userNum = s.nextInt();
  //Create Random number to guess, add 1 to userNumber to create a 0 to number
  int randomNum = r.nextInt(userNum+1);
  System.out.println("A random number to guess has been generated!");
  //Call play game method
  playGame(userNum, randomNum);


  }
  
  static void playGame(int theUserNum, int theRandomNum){
    //Implement a scanner
    Scanner s = new Scanner(System.in);

    //Ask user for a guess
    System.out.println("Guess a number between 0 and " + theUserNum);
    //Record Guess
    int userGuess = s.nextInt();
    int guessCount = 1;

    //Keep user guessing until it is correct
    while (userGuess!=theRandomNum){
      //If userguess is to low, tell them to guess higher
      if (userGuess < theRandomNum){
        System.out.println("Guess Higher!");
      }
      //Otherwise tell them to guess lower
      else{
        System.out.println("Guess Lower!");
      }
      //Tell user to guess again
      System.out.println("Enter your new guess:");
      userGuess = s.nextInt();
      //add 1 to guess count
      guessCount++;
    }  
    //When user guesses correctly tell them they win and how many tries it took
    System.out.println("Great, you win! It took you " + guessCount + " tries");

  }

}