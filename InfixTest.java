import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfixTest {

	@Test
	void test() {
		String infix = "(1+2)*9";
		InfixToPostfixConverter iF = new InfixToPostfixConverter();
		System.out.println(iF.convertToPostfix(infix));
	}

}
