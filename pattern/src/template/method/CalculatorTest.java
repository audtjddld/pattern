/**
 * 
 */
package template.method;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

import java.io.IOException;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 정명성
 * create date : 2016. 2. 12.
 * factory.method.CalculatorTest.java
 */
public class CalculatorTest {
	Calculator calculator;
	String numFilePath;
	
	@Before public void setUp() {
		this.calculator = new Calculator();
		this.numFilePath = getClass().getResource("number.txt").getPath();
	}
	
	/**
	 * 덧셈 
	 * @author 정명성
	 * create date : 2016. 2. 12.
	 * 설명
	 * @throws Exception
	 */
	@Test
	public void sumOfNumbers() throws Exception {
		assertThat(calculator.calcSum(this.numFilePath), is(10));
	}
	
	@Test
	public void multiplyOfNumbers() throws IOException {
		assertThat(calculator.calMultiply(this.numFilePath), is(24));
	}
}
