import java.util.Scanner;
public class Table{
 public static void main(String [] args){

 Scanner scanner = new Scanner(System.in);
  System.out.print("Enter number from 1 -10: ");
  int number = scanner.nextInt();
  int count = 1;

 while(count <= 12){
   if(number < 1){
 		System.out.print("No enter number between 1 - 10: ");
		number = scanner.nextInt();
		count--;
 	} else {
		System.out.printf("%d x %d = %d%n ", number, count,  number * count);
	
}
	count = count +  1;
    }
  }
}