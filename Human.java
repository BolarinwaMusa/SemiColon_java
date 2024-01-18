public class Human{
	private String name;
	private int age;
	private String color;
	private double netWorth;
	private String country;
	
	public Human(String name, int age, String color, double netWorth, String country){
		this.name = name;
		this.age = age;
		this.color = color;
		this.netWorth = netWorth;
		this.country = country;
	}

	public void oruko(String oruko){	
		this.name = oruko;
	}
	public String getOruko(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void color(String color){
	 	this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public void setCountry(String country){
		this.country = country;
	}	
	public String getCountry(){
		return country;
	}
	
	public void setNetWorth(double netWorth){
		this.netWorth = netWorth;
	}	
	public double getNetWorth(){	
		return netWorth;
	}
	
	public String sayHello(){
		return "Hello world";
	}
		
}