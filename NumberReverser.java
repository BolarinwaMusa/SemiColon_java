import java.util.Scanner;
public class NumberReverser {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int reverse = 0;
System.out.println("Enter a positive number and get it printed in reverse order ");
int number = input.nextInt();

int temporary = number;
int remainder = 0;
 while(temporary > 0) {
   remainder = temporary % 10;
   reverse = reverse * 10 + remainder;
  temporary /= 10;
}
   System.out.println("Reverse of " + number + "is " + reverse);
  while(number <10000 || number > 9999) {
    number 
     
 }
}