import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose rock, paper, or scissors. Press 'r' for rock, 'p' for paper and 's' for scissors");
        Scanner scan = new Scanner(System.in);
        var choice = (scan.next());
       int random = (int)(Math.random()*3);

       if (choice.equals("r")) {
           var playerChoice = "Rock";
           if (random == 0){
                   System.out.println("Draw!");
               System.out.println("Computer's choice: Rock    " + "Player's choice: " + playerChoice );
           }
           else if(random == 1) {
                   System.out.println("You lose!");
               System.out.println("Computer's choice: Paper    " + "Player's choice: " + playerChoice );
           }
           else{
               System.out.println("You win!");
               System.out.println("Computer's choice: Scissors    " + "Player's choice: " + playerChoice );
    }}
       else if (choice.equals("s")) {
           var playerChoice = "Scissors";
           if (random == 0){
               System.out.println("You lose!");
               System.out.println("Computer's choice: Rock    " + "Player's choice: " + playerChoice );
           }
           else if(random == 1) {
               System.out.println("You win!");
               System.out.println("Computer's choice: Paper    " + "Player's choice: " + playerChoice );
           }
           else{
               System.out.println("Draw!");
               System.out.println("Computer's choice: Scissors    " + "Player's choice: " + playerChoice );
       }}
       else if (choice.equals("p")) {
           var playerChoice = "Paper";
           if (random == 0){
               System.out.println("You win!");
               System.out.println("Computer's choice: Rock    " + "Player's choice: " + playerChoice );
           }
           else if(random == 1) {
               System.out.println("Draw!");
               System.out.println("Computer's choice: Paper    " + "Player's choice: " + playerChoice );
           }
           else{
               System.out.println("You lose!");
               System.out.println("Computer's choice: Scissors    " + "Player's choice: " + playerChoice );
       }}
       else {
           System.out.println("Invalid answer, please try again!");
       }

    }}