import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

  @DataProvider(name="isprimeNums")
  public static Object[][] isPrimeCheckers(){
	  return new Object[][]{{true,2},{true,3},{true,5},{false,4},{false,9}};
  }
  
  @DataProvider(name="addTest")
  public static Object[][] addTest(){
	  return new Object[][]{{4,1,3},{5,1,4},{100,90,10},{100,0,100}};
  }

  Calculator calculator = new Calculator();
  
  @Test(dataProvider="addTest")
  public void Add(int result,int num_1,int num_2) {
	  Assert.assertEquals(result,calculator.Add(num_1,num_2));
  }

  @Test(enabled=false)
  public void Calculator() {
    throw new RuntimeException("Test not implemented");
  }

  @Test(expectedExceptions = ArithmeticException.class)
  public void Divide() {
	 calculator.Divide(10, 0);
  }

  @Test(dataProvider = "isprimeNums")
  public void IsPrime(boolean isprime,int number) {
	  Assert.assertEquals(isprime,calculator.IsPrime(number));
  }

  @Test(priority=1)
  public void Multiplication() {
	  Assert.assertEquals(4,calculator.Multiplication(4,1));
  }

  @Test
  public void Subtract() {
	  Assert.assertEquals(4,calculator.Subtract(9, 5));
  }
}
