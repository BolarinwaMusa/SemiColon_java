import java.util.Scanner;
public class AgeIdentification {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter your date of birth:");
int DateOfBirth = input.nextInt();
int calculateDate = 2024 - DateOfBirth;
System.out.println("You are " + calculateDate + "years old");
    }
}=