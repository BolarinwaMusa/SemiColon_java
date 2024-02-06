public class PetrolPurchaseTest {
public static void main(String[] args) {


PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba Station","diesel",10,500.0,5.1);


System.out.println("Location " + petrolPurchase.getLocation());
System.out.println("petrol type " +petrolPurchase.getTypeOfPetrol());
System.out.println("quantity per liter " + petrolPurchase.getQuantity());
System.out.println("price per liter " + petrolPurchase.getPricePerLiter());
System.out.println("percentage discount " + petrolPurchase.getPercentageDiscount());

   }
}
