public class PetrolPurchase {
private String location;
private String typeOfPetrol;
private int quantity;
private double pricePerLiter;
private double percentageDiscount;

public PetrolPurchase(String location, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
  this.location = location;
  this.typeOfPetrol = typeOfPetrol;
  this.quantity = quantity;
  this.pricePerLiter = pricePerLiter;
  this.percentageDiscount = percentageDiscount;
}

public String getLocation() {
	return location;
}
 public void setLocation(String location) {
 	this.location = location;
}
 public String getTypeOfPetrol() {
	 return typeOfPetrol;
}
 public void setTypeOfPetrol(String typeOfPetrol){
	this.typeOfPetrol = typeOfPetrol;
}

 public int getQuantity() {
	 return quantity;
}
 public void setQuantity(int quantity){
	this.quantity = quantity;
}
 public double getPricePerLiter() {
	 return pricePerLiter;
}
 public void setPricePerLiter(double pricePerLiter) {
      this.pricePerLiter = pricePerLiter;
}
 public double getPercentageDiscount() {
	return percentageDiscount;
}
 public void setPercentageDiscount() {
	this.percentageDiscount = percentageDiscount;
}
   public void purchaseAmount(double purchaseAmount) {
    if (purchaseAmount > 0.0) {
    purchaseAmount=quantity * pricePerLiter - percentageDiscount;
		
	}	
}
    }
  

 