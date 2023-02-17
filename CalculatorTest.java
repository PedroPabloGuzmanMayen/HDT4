import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 *
 */
class CalculatorTest {

	@Test
	/**
	 * Este método prueba el método evaluate de la clase calculadora
	 */
	void Calculatortest() {
		Calculator calc = new Calculator();
		Double res = calc.evaluate("6 2 3 + *");
		Double expected = 30.0;
		assertEquals(expected, res);
	}
	@Test
	/**
	 * Este método prueba el método get previous de calculadora
	 */
	void lastResultTest() {
		Calculator calc = new Calculator();
		String expresion = "6 2 3 + *";
		calc.evaluate(expresion);
		Double last = calc.getPrevious();
		Double expected = 30.0;
		assertEquals(expected, last);
	}


}
