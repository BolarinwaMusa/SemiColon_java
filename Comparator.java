import java.util.Scanner;
public class Comparator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number1 = input.nextInt();
System.out.println("Enter the second number: ");
int number2 = input.nextInt();
System.out.println("Enter third number: ");
int number3 = input.nextInt();
 int sum = number1 + number2 + number3;
 int product = number1 * number2 * number3;
 int average = sum / 3;
System.out.println("the sum of the numbers entered is "+ sum);
System.out.println("the product of the numbers entered is "+ product);
System.out.println("the average of the numbers entered is "+ average);

    }
}
