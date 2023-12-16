import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{
@Test
public void testThisCalculatorAddPositive(){
    Calculator newCalculator = new Calculator ();
    int sum = newCalculator.add(5,6);
    assertEquals(11, sum);
  }

}