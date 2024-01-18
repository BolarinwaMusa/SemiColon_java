public class AccountTest{
    public static void main(String[] args){
	Account myAccount = new Account("Kareem", 21, 5.4);
	Account myAccount2 = new Account("Dickson", 12, 4.5);
	Account myAccount3 = new Account("Benzon", 19, 3.4);

    	String name =  "Musa";
	int age = 18;
	double height = 5.2;
	
	String name2 =  "Xavier";
	int age2 = 14;
	double height2 = 4.7;

	String name3 = "Volas";
	int age3 = 21;
	double height3 = 3.14;
	
	System.out.printf("Initial account name is %s%n", myAccount.getName());
	System.out.printf("Initial account age is %s%n", myAccount.getAge());
	System.out.printf("Initial account height is %.2f%n", myAccount.getHeight());
	

	myAccount.setName(name);
	myAccount.setAge(age);
	myAccount.setHeight(height);
	
	myAccount2.setName(name2);
	myAccount2.setAge(age2);
	myAccount2.setHeight(height2);
	
	myAccount3.setName(name3);
	myAccount3.setAge(age3);
	myAccount3.setHeight(height3);
	
	System.out.println();
	System.out.printf("New account name is %s%n", myAccount.getName());
	System.out.printf("New account age is %d%n", myAccount.getAge());
	System.out.printf("New account height is %.2f%n", myAccount.getHeight());
	

	System.out.printf("Account2 name is %s%n", myAccount2.getName());
	System.out.printf("Account2 age is %d%n", myAccount2.getAge());
	System.out.printf("Account2 height is %.2f%n", myAccount2.getHeight());
	
	System.out.printf("Account3 name is %s%n", myAccount3.getName());
	System.out.printf("Account3 age is %d%n", myAccount3.getAge());
	System.out.printf("Account3 height is %.2f%n", myAccount3.getHeight());
    }
}