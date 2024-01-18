public class HumanTest{
    public static void main(String[] args){
	Human human1 = new Human("Young", 17, "Black", 5500.50, "Nigeria");	
	Human human2 = new Human("King", 34, "White", 1000500.50, "United Kingdom");
	Human human3 = new Human("Queen", 27, "Brown", 57500.50, "America");	
	Human human4 = new Human("Guard", 24, "White", 1000.50, "Ukraine");
	
/*	human1.oruko("Xavier");
	human1.setAge(18);
	human1.color("Black");
	human1.setCountry("America");
	human1.setNetWorth(400000.93);  */
		
	System.out.println(human1.getOruko());
	System.out.println(human1.getAge());
	System.out.println(human1.getColor());
	System.out.println(human1.getCountry());
	System.out.println(human1.getNetWorth());
	System.out.println();

	System.out.println(human2.getOruko());
	System.out.println(human2.getAge());
	System.out.println(human2.getColor());
	System.out.println(human2.getCountry());
	System.out.println(human2.getNetWorth());
	System.out.println();

	System.out.println(human3.getOruko());
	System.out.println(human3.getAge());
	System.out.println(human3.getColor());
	System.out.println(human3.getCountry());
	System.out.println(human3.getNetWorth());
	System.out.println();

	System.out.println(human4.getOruko());
	System.out.println(human4.getAge());
	System.out.println(human4.getColor());
	System.out.println(human4.getCountry());
	System.out.println(human4.getNetWorth());
	System.out.println();
	
	System.out.println(human1.sayHello());

    }
}