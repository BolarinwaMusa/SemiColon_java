import java.util.Scanner;
public class PrimeNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a positivenumber and see if it is a prime or not: ");
  int number = input.nextInt();
  int count = 0;
   for(int index = 1; index < number; index++) {
	if(number % index == 0){
	 count++;
    }
 }

	if(count > 1) {
		System.out.println("It is not a prime number");
	}
	else {
		System.out.println("It is a prime number");
 	}
  
  }
}