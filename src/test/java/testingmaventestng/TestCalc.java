package testingmaventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class TestCalc {
  @Test
  public void testAdd() {
	  Libmath lib = new Libmath();
	  int num1 = 10;
	  int num2 = 20;
	  int actSum = lib.Sum(num1, num2);
	  
	  int expSum = 30;
	  System.out.println("sum is " + actSum);
	  assertEquals(actSum, expSum);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

}
