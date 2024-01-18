import java.util.Scanner;
public class ForSampling {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//System.out.print("Enter number ");
//int year = input.nextInt();

for(int index=101 ; index <=2004; index++ ) {
int sum =index % 4 ==0 ;

  System.out.println(sum);
  }
}
}