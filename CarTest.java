public class CarTest {
 public static void main(String[] args){
  Car car = new Car();

   car.setName("Mercedes");
   car.setModel(350);
   car.setPrice(457_567.54);
   car.setColour("Green");
   car.setSpeedLimit(457.30);


 System.out.println(car.getName());
 System.out.println(car.getModel());
 System.out.println(car.getPrice());
 System.out.println(car.getColour());
 System.out.println(car.getSpeedLimit());
	
	
  }
 }