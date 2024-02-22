import java.util.Scanner;
public class LargestNumber{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

int counter = 0;
int largest = 0;
System.out.println("Enter number ");

while (counter < 10){
int number = input.nextInt();
   System.out.println("Enter number ");


    if(number > largest){
  largest = number;

   }
     counter++;
  }


    System.out.println("the largest number is " + largest );

 } 
}