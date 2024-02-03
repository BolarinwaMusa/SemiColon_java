import java.util.Scanner;
public class SelectionStatement {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter number ");
int number = input.nextInt();
   if(number== 1){
   System.out.print(0);
}
  else if(number == 0) {
   System.out.print(1);
}
  else if(number!=1) {
 System.out.println("wrong number");
    }
  }
 }  