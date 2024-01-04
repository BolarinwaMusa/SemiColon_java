 import java.util.Scanner;
 public class Seconds {
 public static void main(String[] args){
 int seconds;
 Scanner input = new Scanner(System.in);
 System.out.print("Enter seconds ");
 seconds = input.nextInt();
int hours = seconds / 3600;
seconds = seconds % 3600;
int minutes = seconds % 60;
System.out.println("Hours: " + hours);
System.out.println("Minutes: " + minutes);
System.out.println("Seconds: " + seconds);
 }
}
 