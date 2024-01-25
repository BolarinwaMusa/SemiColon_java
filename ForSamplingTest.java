public class ForSamplingTest {
public static void main(String[] args) {
 ForSampling forsampling = new ForSampling(10,"loop");
 System.out.println(ForSampling.getIndex());
 System.out.println(ForSampling.getName());

for(int index=10 ; index <=20; index++ ) {
  System.out.println(index); 
System.out.println(ForSampling.getIndex());
System.out.println(ForSampling.getName());
}
}
}