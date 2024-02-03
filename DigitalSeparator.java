import java.util.Scanner;
public class DigitalSeparator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a five digit number and get it separated: ");
int digit = input.nextInt();

int firstDigit = digit / 10_000;
int secondDigit = digit / 1000 % 10;
int thirdDigit = digit / 100 % 10;
int fourthDigit = digit / 10 % 10;
int lastDigit = digit % 10; 

System.out.printf("%d ",firstDigit);
System.out.printf("%d ", secondDigit);
System.out.printf("%d ", thirdDigit);
System.out.printf("%d ", fourthDigit);
System.out.printf("%d ", lastDigit);
  }
}