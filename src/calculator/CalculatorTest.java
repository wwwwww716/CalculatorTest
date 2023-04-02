package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	@Test
	void add() {
		Calculator cal = new Calculator();
		int result  = cal.add(2,1);
		assertEquals(3, result);
	}

	@Test
	void subtract() {
		Calculator cal = new Calculator();
		int result = cal.subtract(2, 1);
		assertEquals(1, result);
	}

	@Test
	void mutiply() {
		Calculator cal = new Calculator();
		int result = cal.multiply(4, 2);
		assertEquals(8, result);
	}

	@Test
	void divide() {
		Calculator cal = new Calculator();
		int result = cal.divide(3, 2);
		assertEquals(1, result);
	}
}
