public class Car {
	private String name;
	private int model;
	private double price;
	private String colour;
	private double speedLimit;
   Car (String name, int model, double price, String colour, double speedLimit) {
	/*this.name = name;
	this.model = model;
	this.price = price;
	this.colour = colour;
	this.speedLimit = speedLimit;*/
 }

    public void setName(String name){
	   this.name = name;
 }
    public String getName() {
	  return name;
 }
   public void setModel(int model) {
	   this.model = model;
 }
   public int getModel() {
	  return model;
 }
   public void setPrice(double price) {
	   this.price = price;
 }
   public double getPrice() {
	    return price;
 }
   public void setColour(String colour) {
	    this.colour = colour;
 }
   public String getColour() {
	    return colour;
 }
   public void setSpeedLimit(double speedLimit) {
	     this.speedLimit = speedLimit;
 }
   public double getSpeedLimit() {
	    return speedLimit;
 }
	
	
	

}