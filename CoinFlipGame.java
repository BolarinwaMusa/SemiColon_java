import java.util.Scanner;
 public class CoinFlipGame{
 public static void main(String [] args ){
 Scanner input= new Scanner (System.in);
  int CoinResult = (int) (Math.random() * 2);
  System.out.print ("Guess the coinFlip! Enter 0 for heads or 1 for tails: " );
 int userGuess = input.nextInt();
  System.out.print( "The coin flip result is: " + (CoinResult ==0 ? "Heads" : "Tails"));
  if (userGuess== CoinResult )
   System.out.print(" Congratulations! Your guess is correct " );
  if (userGuess != CoinResult)
  System.out.print(" Sorry, your guess is incorrect " );
	  }
     }



  