import java.util.Scanner;
public class Multiply {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number and get the Multiplication table ");
 int number = input.nextInt();
 
  for(int index = 0; index<=12; index++) {
System.out.println(number +"X" + index + "="+ number * index);
    }
  }
}

 
