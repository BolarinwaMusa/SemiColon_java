import java.util.Scanner;

public class AccountdTest {

   public static void main(String[] args){

 Accountd accountd1 = new Accountd("Jane Green",50.00);
 Accountd accountd2 = new Accountd("John Blue", -7.53);

System.out.printf("%s balance: $%.2f%n",  accountd1.getName(), accountd1.getBalance());

System.out.printf("%s balance: $%.2f%n%n", accountd2.getName(), accountd2.getBalance());


Scanner input = new Scanner(System.in);

System.out.print("Enter deposit amount for accountd1:");
double depositAmount = input.nextDouble();

System.out.printf("%nadding %.2f to accountd1 balance%n%n ", depositAmount);

 accountd1.deposit(depositAmount);

System.out.printf("%s balance:$%.2f%n ",accountd1.getName(), accountd1.getBalance());

System.out.printf("%s balance: $ %.2f%n%n", accountd2.getName(), accountd2.getBalance());

System.out.print("Enter deposit amount for accountd2: ");
depositAmount = input.nextDouble();

System.out.printf("%n adding %.2f to accountd2 balance%n%n", depositAmount);
account2.deposit(depositAmount);

System.out.printf("%s balance: $%.2f%n", accountd1.getName(),accountd1.getBalance());

System.out.printf("%s balance: $%.2f%n%n", accountd2.getName(), accountd2.getBalance());

System.out.print("Enter deposit amount for accountd2:");
depositAmount = input.nextDouble();

System.out.printf("%n adding %.2f to accountd2 balance %n%n", depositAmount);
accountd2.deposit(depositAmount);

System.out.printf("%s balance:$%.2f%n ", accountd1.getName(), accountd1.getBalance());

System.out.printf("%s balance: $%.2f%n%n ",accountd2.getName(), accountd2.getBalance());
   }
}