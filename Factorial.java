import java.util.Scanner;
public class Factorial {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int fact = 1;
System.out.print("Enter a positive number and get the factorial value: ");
int number = input.nextInt();
 for(int index = 1; index <= number; index++ ) {
 fact *= index;
}
System.out.println("Factorial: " + fact);
  }
} 